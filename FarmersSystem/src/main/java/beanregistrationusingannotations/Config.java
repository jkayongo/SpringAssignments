package beanregistrationusingannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Farmer farmer() {
		return new Farmer();
	}
	
}
