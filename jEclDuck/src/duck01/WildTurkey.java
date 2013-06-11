package duck01;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 11.06.13
 * Time: 16:50
 */
public class WildTurkey implements Turkey {
    @Override
    public String gouble() {
        return "Goubble goubble";
    }

    @Override
    public String fly() {
        return "I'm fly a shot distance";
    }
}
