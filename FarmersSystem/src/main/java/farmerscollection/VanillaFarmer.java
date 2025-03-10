package farmerscollection;




import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VanillaFarmer {
	@Value("${userNames}")
	String farmerUserName;
	@Value("${password}")
	String farmerPassword;
	@Value("Vanilla")
	String cropGrown;
	@Value("${age:24}")
	int farmerAge;
	@Value("${vanillaMarkets}")
	String [] vanillaMarkets;
	@Value("${os.name}")
	String deviceOperatingSystem;
	@Value("#{environment['adminID']}")
	String farmerAdminId;
	@Value("#{environment['adminUserName']?: 'Not available'}")
	String farmerAdminUserName;
	@Value("#{${producePerDistrict}}")
	 HashMap<String, Integer> producePerDistrict;
	public void showFarmerBio() {
		System.out.println("Farmer user name: " + farmerUserName + " " + "Password: " + farmerPassword + " " + "Crop grown: " + cropGrown + " "+ "Age: " + farmerAge);
		
		for(String vanillaMarket : vanillaMarkets) {
			System.out.println(vanillaMarket);
		}
		System.out.println("Device operating system: " + deviceOperatingSystem);
		System.out.println("Farmer admin id: " + farmerAdminId);
		System.out.println("Farmer admin userName: " + farmerAdminUserName);
		for(String district : producePerDistrict.keySet()) {
			System.out.println("District: " + district + " " + "Produce:" + producePerDistrict.get(district));
		}
	}

}
