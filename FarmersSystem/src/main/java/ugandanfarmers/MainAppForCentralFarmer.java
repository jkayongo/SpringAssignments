package ugandanfarmers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAppForCentralFarmer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForCentralFarmer.class);
		CentralFarmer centralFarmer = context.getBean(CentralFarmer.class);
		centralFarmer.printUserNameAndPassword();

	}

}
