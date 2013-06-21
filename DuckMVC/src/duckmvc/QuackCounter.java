package duckmvc;



/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 14:22
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable  observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
        //observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
