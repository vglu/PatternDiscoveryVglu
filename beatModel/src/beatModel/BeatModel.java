package beatModel;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 17:30
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer   sequencer;
    ArrayList   beatObservers = new ArrayList();
    ArrayList   bpmObservers = new ArrayList();
    int         bpm = 90;
    private     Sequence sequence;
    private     Track traсk;


    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        traсk = sequence.createTrack();

        makeTracks(trackList);
        traсk.add(makeEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (key != 0) {
                traсk.add(makeEvent(144,9,key,100,i));
                traсk.add(makeEvent(128,9,key,100,i+1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return event;
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            traсk = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notyfyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BMPObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BMPObserver o) {
        bpmObservers.remove(o);
    }

    void beatEvent() {
        notifyBeatObservers();
        notyfyBPMObservers();
    }

    private void notifyBeatObservers() {
        Iterator    iterator = beatObservers.iterator();
        while (iterator.hasNext()) {
            BeatObserver beatObserver = (BeatObserver)iterator.next();
            beatObserver.updateBeat();
        }
    }

    private void notyfyBPMObservers() {
        Iterator    iterator = bpmObservers.iterator();
        while (iterator.hasNext()) {
            BMPObserver bpmObserver = (BMPObserver)iterator.next();
            bpmObserver.updateBPM();
        }
    }

    @Override
    public void meta(MetaMessage meta) {
        //meta.
    }
}
