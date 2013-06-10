package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 15:33
 */
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.Off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
