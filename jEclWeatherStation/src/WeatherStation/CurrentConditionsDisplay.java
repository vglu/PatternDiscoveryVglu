package WeatherStation;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable	observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable	_observable) {
		this.observable = _observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + this.temperature + " F degrees and " + this.humidity + " % humidity");
		
	}

	@Override
	public void update(Observable	_obs, Object arg) {
		if (_obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)_obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}
}
