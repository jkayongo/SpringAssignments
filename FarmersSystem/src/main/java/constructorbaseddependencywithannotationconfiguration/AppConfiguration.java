package constructorbaseddependencywithannotationconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Supplier supplier() {
		return new Supplier();
	}
	@Bean
	public Consumer consumer() {
		return new Consumer(supplier()); //pass the supplier bean to the Consumer constructor so as to fullfill the dependency.
	}
	

}
