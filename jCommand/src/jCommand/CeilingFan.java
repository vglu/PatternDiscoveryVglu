package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 15:28
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;
    String location;


    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void on() {
        System.out.println("CeilingFan on");
    }

    public void Off() {
        System.out.println("CeilingFan off");
    }

    public void low() {
        speed = LOW;
    }
}
