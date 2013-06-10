package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 14:56
 */
public class StereoOnWithCDCommand implements Command {
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    Stereo stereo;


    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
