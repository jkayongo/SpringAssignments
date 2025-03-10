package learningsingletonscope.LearningSpringScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@ComponentScan(basePackages = "learningsingletonscope.LearningSpringScope")
public class Config {
	@Bean
	@Scope("prototype")
	public Student student() {
		return new Student(1, "Samson Kyakuwadde", "Animal husbandry");
	}

	public static void main(String[] args) {
		

	}

}
