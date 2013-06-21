package duckmvc;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 14:12
 */
public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("Squeak");

    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
