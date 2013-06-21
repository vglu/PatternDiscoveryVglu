package beatModel;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 17:26
 */
public interface BeatModelInterface {
    void initialize();

    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BMPObserver o);
    void removeObserver(BMPObserver o);
}
