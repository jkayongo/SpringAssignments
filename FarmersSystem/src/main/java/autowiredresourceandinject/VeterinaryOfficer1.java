package autowiredresourceandinject;

import org.springframework.stereotype.Component;

@Component
public class VeterinaryOfficer1 implements VeterinaryServices {
	public String farmVisit() {
		return "Once a month";
	}
	public int numberOfFarmVisits() {
		return 12;
		
	}
	public String typeOfMedication() {
		return "Vaccination";
	}

}
