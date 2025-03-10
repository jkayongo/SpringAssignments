package setterbaseddependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class WeatherForecast {
	String forecast;
	public String startPlanting() {
		return "Weather is good for planting,please go ahead!";
	}

	public static void main(String[] args) {
		

	}

}
