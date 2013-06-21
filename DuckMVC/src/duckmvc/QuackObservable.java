package duckmvc;



/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 20.06.13
 * Time: 14:51
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
