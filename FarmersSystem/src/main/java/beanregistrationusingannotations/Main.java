package beanregistrationusingannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class); 
		Farmer farmer = context.getBean(Farmer.class);
		System.out.println(farmer.signUpFarmer());
		
	
	}

}
