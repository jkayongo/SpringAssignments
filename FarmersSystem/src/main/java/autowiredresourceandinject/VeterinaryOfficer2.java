package autowiredresourceandinject;

import org.springframework.stereotype.Component;

@Component
public class VeterinaryOfficer2 implements VeterinaryServices {
	public String farmVisit() {
		return "two days in a month";
	}
	public int numberOfFarmVisits() {
		return 24;
		
	}
	public String typeOfMedication() {
		return "Deworming";
	}
}
