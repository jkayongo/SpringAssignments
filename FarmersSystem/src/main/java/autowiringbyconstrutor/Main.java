package autowiringbyconstrutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		District district = context.getBean(District.class);
		district.amountRequired();
		

	}

}
