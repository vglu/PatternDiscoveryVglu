package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoor {
    public GarageDoor(String description) {
        this.description = description;
    }

    String description;

    public void up() {
        System.out.println("GarageDoor.up");
    }

    public void down() {
        System.out.println("GarageDoor.down");
    }

    public void stop() {
        System.out.println("GarageDoor.stop");
    }

    public void lightOn() {
        System.out.println("GarageDoor.lightOn");
    }

    public void lightOff() {
        System.out.println("GarageDoor.lightOff");
    }
}
