package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo _stereo) {
        this.stereo = _stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
