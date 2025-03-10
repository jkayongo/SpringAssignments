package setterbaseddependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public WeatherForecast weatherForecast() {
		return new WeatherForecast();
	}
	@Bean
	public Farmer farmer() {
		Farmer farmer = new Farmer();
		farmer.setFarmerName("Nuwa Mbaguta");
		//injecting the bean weatherForecast using the setter
		farmer.setWeatherforecast(weatherForecast());
		return farmer;
	}
	

}
