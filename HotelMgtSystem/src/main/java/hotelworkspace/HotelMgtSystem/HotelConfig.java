package hotelworkspace.HotelMgtSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class HotelConfig {
	@Bean
	@Profile("dev")
	public Client client() {
		return new Client();
	}
	@Bean
	@Profile("test")
	public Food food() {
		return new Food();
	}

}
