package autowiringbyconstrutor;

import org.springframework.beans.factory.annotation.Autowired;

public class District {
	Region region;
	@Autowired
	public District(Region region) {
		this.region = region;
	}
	public void amountRequired() {
		System.out.println("Tonnes: " + region.quantityExpected());
	}
	

}
