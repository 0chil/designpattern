package observer.example.observer;

import observer.example.subject.Subject;
import observer.example.subject.WeatherData;
import observer.example.util.TemperatureUtil;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private final WeatherData subject;

	public HeatIndexDisplay(WeatherData subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(
			"체감 온도: 화씨 " + computeHeatIndex(temperature, humidity) + "F, 섭씨 " + TemperatureUtil.convertFtoC(
				computeHeatIndex(temperature, humidity)) + "C");
	}

	@Override
	public void update() {
		this.temperature = subject.getTemperature();
		this.humidity = subject.getHumidity();
		display();
	}

	private float computeHeatIndex(float t, float rh) {
		return (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
			(0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
			(0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
	}
}
