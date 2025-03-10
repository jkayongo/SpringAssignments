package autowiringdependenciesbyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CoffeeBrewer coffeebrewer = context.getBean(CoffeeBrewer.class);
		coffeebrewer.checkCoffeeStock();
		

	}

}
