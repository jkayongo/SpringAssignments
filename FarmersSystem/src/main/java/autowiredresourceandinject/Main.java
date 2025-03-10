package autowiredresourceandinject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DogFarmer dogFarmer = context.getBean(DogFarmer.class);
		dogFarmer.checkUpStatus();
	}

}
