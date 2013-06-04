package WeatherStation;

public interface Subject {
	public void registerObserver(Observer _o);
	public void removeObserver(Observer _o);
	public void notifyObservers();
}
