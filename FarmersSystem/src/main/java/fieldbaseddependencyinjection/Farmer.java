package fieldbaseddependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Farmer {
	String farmerName;
	String residence;
	@Autowired
	@Qualifier("mukonoFarmer") //this will bring the implementation of MukonoFarmer
	Crop crop; //Spring automatically injects the Crop bean in the field named crop.
	public void assignedCrop() {
		System.out.println("Assigned crop: " + crop.typeOfCrop());
	}
	public void plantSeason() {
		System.out.println("Plant season: " + crop.typeOfSeason());
	}
	

}
