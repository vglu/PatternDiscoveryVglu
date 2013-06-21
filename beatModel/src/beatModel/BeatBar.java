package beatModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 21.06.13
 * Time: 13:57
 */
public class BeatBar extends JProgressBar implements Runnable {

    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for (;;) {
            int value = getValue();
            value = (int) (value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            ;
        }
    }
}