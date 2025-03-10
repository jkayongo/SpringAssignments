package autowiredresourceandinject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAppForVeterinaryServices {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForVeterinaryServices.class);
		VeterinaryOfficersApp veterinaryOfficer = context.getBean(VeterinaryOfficersApp.class);
		veterinaryOfficer.veterinaryOfficersServices();
		

	}

}
