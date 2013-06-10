package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class LightOffCommand implements Command {

    public LightOffCommand(Light light) {
        this.light = light;
    }

    Light light;



    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
