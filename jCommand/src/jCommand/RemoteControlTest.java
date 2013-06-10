package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 13:09
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Simple light");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor  garageDoor = new GarageDoor("<<empty>>");
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}
