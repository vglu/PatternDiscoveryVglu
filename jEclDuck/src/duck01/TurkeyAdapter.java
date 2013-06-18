package duck01;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 11.06.13
 * Time: 16:53
 */
public class TurkeyAdapter implements Duck {
    Turkey  turkey;

    public TurkeyAdapter(Turkey _turkey) {
        turkey = _turkey;
    }


    @Override
    public String performQuackBehavior() {
        return turkey.gobble();
    }

    @Override
    public String performFlyBehavior() {
        String  tmp = "";
        for (int i=0; i < 5; i++) {
            tmp += "\n" + turkey.fly();
        }
        return tmp;
    }

    @Override
    public String duckClassName() {
        return "Turkey :-) ";
    }

    @Override
    public String display() {
        return "Turkey :-) ";
    }

    @Override
    public String swim() {
        return "Not swim";
    }

    @Override
    public int weigth() {
        return 12;
    }
}
