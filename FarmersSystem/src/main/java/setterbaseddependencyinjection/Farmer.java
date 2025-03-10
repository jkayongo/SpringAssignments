package setterbaseddependencyinjection;

import org.springframework.stereotype.Component;

public class Farmer {
	String farmerName;
	WeatherForecast weatherforecast;
	

	public String getFarmerName() {
		return farmerName;
	}


	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}


	public WeatherForecast getWeatherforecast() {
		return weatherforecast;
	}

	//setter method for dependency injection
	public void setWeatherforecast(WeatherForecast weatherforecast) {
		this.weatherforecast = weatherforecast;
	}
	public void farmStatus() {
		System.out.println(farmerName + " " + weatherforecast.startPlanting());
	}


	public static void main(String[] args) {
		

	}

}
