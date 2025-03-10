package setterbaseddependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import constructorbaseddependencyinjection.Config;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Farmer farmer = context.getBean(Farmer.class);
		farmer.farmStatus();		

	}

}
