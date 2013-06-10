package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int _slot, Command _onCommand, Command _offCommand) {
        onCommands[_slot] = _onCommand;
        offCommands[_slot] = _offCommand;
    }

    public void onButtonWasPushed(int _slot) {
        onCommands[_slot].execute();
    }

    public void  offButtonWasPushed(int _slot) {
        offCommands[_slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ RemoteControl ------ \n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
