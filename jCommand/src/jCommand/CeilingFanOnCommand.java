package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 15:31
 */
public class CeilingFanOnCommand implements Command{
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    CeilingFan  ceilingFan;

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.Off();
    }
}
