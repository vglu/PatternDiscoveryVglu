package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command _command) {
        slot = _command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
