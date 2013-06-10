package jCommand;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
public class Light {

    public Light(String description) {
        this.description = description;
    }

    String description;


    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }

}
