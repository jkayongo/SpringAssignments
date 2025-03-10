package autowiringbyconstrutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
	@Bean
	public Region region() {
		return new Region();
	}
	@Bean
	public District district() {
		return new District(region());
	}

}
