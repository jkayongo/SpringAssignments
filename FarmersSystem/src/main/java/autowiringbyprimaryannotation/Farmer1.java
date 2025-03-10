package autowiringbyprimaryannotation;

import org.springframework.stereotype.Component;

@Component
public class Farmer1 implements Season {
	public String season1() {
		return "Dry season:Land preparation";
	}
	public String season2() {
		return "Wet season: Digging teracces";
	}
	

}
