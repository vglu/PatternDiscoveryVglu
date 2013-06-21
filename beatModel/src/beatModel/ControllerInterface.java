package beatModel;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 18:09
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
