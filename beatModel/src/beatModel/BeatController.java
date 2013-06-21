package beatModel;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 18:10
 */
public class BeatController implements ControllerInterface {
    BeatModelInterface  model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM()+1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM()-1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
