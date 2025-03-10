package singletonescope.SpringScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
	@Bean
	@Scope("singleton")
	public Student studentSingleton() {
		return new Student(1, "Vincent Gyaviira", "MDD");
	}

}
