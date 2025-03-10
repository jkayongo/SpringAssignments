package constructorbaseddependencywithannotationconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Consumer consumer = context.getBean(Consumer.class);
		consumer.notification();
		

	}

}
