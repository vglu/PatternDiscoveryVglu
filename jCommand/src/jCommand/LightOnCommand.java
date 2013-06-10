package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 12:57
 * To change this template use File | Settings | File Templates.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light _light) {
        this.light = _light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
