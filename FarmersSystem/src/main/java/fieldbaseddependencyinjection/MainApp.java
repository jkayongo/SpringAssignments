package fieldbaseddependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import constructorbaseddependencyinjection.Config;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Farmer farmer = context.getBean(Farmer.class);
		farmer.assignedCrop();
		farmer.plantSeason();
	}

}
