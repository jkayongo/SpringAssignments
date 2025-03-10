package autowiredresourceandinject;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;


@Component
public class VeterinaryOfficersApp {
	@Resource(name = "veterinaryOfficer1") 
	private VeterinaryServices veterinaryOfficer1;
	@Resource(name = "veterinaryOfficer2")
	private VeterinaryServices veterinaryOfficer2;
	public void veterinaryOfficersServices() {
		System.out.println("Veterinary Officer 1:" + "Farm Visit: " + veterinaryOfficer1.farmVisit() + " " + "Number of farm visits: " + veterinaryOfficer1.numberOfFarmVisits() + " " + "Type of medication: " + veterinaryOfficer1.typeOfMedication());
		System.out.println("Veterinary Officer 2:" + "Farm Visit: " + veterinaryOfficer2.farmVisit() + " " + "Number of farm visits: " + veterinaryOfficer2.numberOfFarmVisits() + " " + "Type of medication: " + veterinaryOfficer2.typeOfMedication());
		
	}
}
