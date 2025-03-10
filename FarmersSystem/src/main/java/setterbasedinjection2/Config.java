package setterbasedinjection2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Crop crop() {
		Crop crop = new Crop();
		crop.setType("vegetables");
		return crop;
	}
	@Bean
	public Market market() {
		Market market = new Market();
		market.setRegion(crop());
		return market;
	}
	
}
