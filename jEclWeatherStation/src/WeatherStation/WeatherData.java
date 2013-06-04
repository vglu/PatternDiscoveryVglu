package WeatherStation;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	
	public void measurementsChanget() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float _temperature, float _humidity, float _pressure) {
		this.temperature = _temperature;
		this.humidity = _humidity;
		this.pressure = _pressure;
		this.measurementsChanget();
	}


}
