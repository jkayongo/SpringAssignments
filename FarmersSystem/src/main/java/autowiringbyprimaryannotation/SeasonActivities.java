package autowiringbyprimaryannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeasonActivities {
	@Autowired
	private Season seasonForFarmer2; 
	public void activity() {
		System.out.println("Farmer2: " + seasonForFarmer2.season2());
	}

}
