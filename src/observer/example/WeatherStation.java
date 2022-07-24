package observer.example;

import observer.example.observer.CurrentConditionDisplay;
import observer.example.observer.HeatIndexDisplay;
import observer.example.subject.Subject;
import observer.example.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.1f);
		weatherData.setMeasurements(82, 70, 30.2f);
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.setMeasurements(78, 90, 30.3f);
	}
}
