package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 15:35
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
