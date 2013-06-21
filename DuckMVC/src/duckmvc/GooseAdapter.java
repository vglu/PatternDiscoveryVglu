package duckmvc;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 14:18
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;



    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
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
