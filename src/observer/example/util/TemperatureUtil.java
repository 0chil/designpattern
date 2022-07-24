package observer.example.util;

public class TemperatureUtil {

	public static float convertFtoC(float fahrenheitTemperature) {
		return (fahrenheitTemperature - 32) * 5 / 9;
	}
}
