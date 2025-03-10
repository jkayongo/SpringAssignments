package farmrecords;

import org.springframework.stereotype.Component;

@Component
public class Farmer2 {
	Farmer1 farmer1;
	public Farmer2(Farmer1 farmer1) {
		this.farmer1 = farmer1;
	}
	public void alertFarmer2() {
		System.out.println("Notification: " + farmer1.message());
	}

}
