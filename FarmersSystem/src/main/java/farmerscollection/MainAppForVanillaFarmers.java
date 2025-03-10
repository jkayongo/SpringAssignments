package farmerscollection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainAppForVanillaFarmers {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForVanillaFarmers.class);
		VanillaFarmer vanillaFarmer = context.getBean(VanillaFarmer.class);
		vanillaFarmer.showFarmerBio();

	}

}
