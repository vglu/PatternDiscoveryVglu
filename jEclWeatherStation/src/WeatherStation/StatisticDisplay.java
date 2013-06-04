package WeatherStation;

import java.util.*;

public class StatisticDisplay extends CurrentConditionsDisplay {
	private float tempAvr;
	private float tempMax;
	private float tempMin;
	ArrayList<Float> temps;
	
	
	public StatisticDisplay(Observable	_observable) {
		super(_observable);
		temps = new ArrayList<Float>();
	}

	@Override
	public void display() {
		System.out.println("Avr/Max/Min temperature = " + tempAvr + "/" + tempMax + "/" + tempMin);
	}

	@Override
	public void update(Observable	_obs, Object _arg) {
		if (_obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)_obs;
			;
		
			if (temps.size() > 0)
			{
				tempMax = Math.max(tempMax, weatherData.getTemperature());
				tempMin = Math.min(tempMin, weatherData.getTemperature());
				temps.add(weatherData.getTemperature());
				float buffer = 0;
				Iterator<Float> it = temps.iterator();
				while (it.hasNext()) {
					buffer += it.next();
				}
				tempAvr = temps.size() == 0 ? 0 : buffer / temps.size();
			}
			else
			{
				tempMax = weatherData.getTemperature();
				tempMin = weatherData.getTemperature();
				tempAvr = weatherData.getTemperature();
				temps.add(weatherData.getTemperature());
			}
		}
		super.update(_obs, _arg);
	}
}
