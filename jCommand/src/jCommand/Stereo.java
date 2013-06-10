package jCommand;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 07.06.13
 * Time: 15:30
 */
public class Stereo {
    private int volume;

    public Stereo(String description) {
        this.description = description;
    }

    String description;

    public void off() {
        System.out.println("Stereo off");
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void setCD() {
        System.out.println("Stereo setCD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Set volume " + volume);
    }
}
