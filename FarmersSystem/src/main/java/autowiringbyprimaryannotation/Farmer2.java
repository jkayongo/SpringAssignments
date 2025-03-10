package autowiringbyprimaryannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Farmer2 implements Season {
	public String season1() {
		return "Dry season: Mulching";
		
	}
	public String season2() {
		return "Wet season: water harvesting";
	}

}
