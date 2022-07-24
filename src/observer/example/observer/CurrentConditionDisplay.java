package observer.example.observer;

import observer.example.subject.WeatherData;
import observer.example.util.TemperatureUtil;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private final WeatherData subject;

	public CurrentConditionDisplay(WeatherData subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(
			"현재 상태: 온도 - 화씨 " + temperature + "F, 섭씨 " + TemperatureUtil.convertFtoC(temperature) + "C, 습도 " + humidity
				+ "%");
	}

	@Override
	public void update() {
		this.temperature = subject.getTemperature();
		this.humidity = subject.getHumidity();
		display();
	}
}
