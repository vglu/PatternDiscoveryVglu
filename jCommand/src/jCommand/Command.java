package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    public void execute();
    public void undo();
}
