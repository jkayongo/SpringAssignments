package setterbasedinjection2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import constructorbaseddependencyinjection.Config;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Market market = context.getBean(Market.class);
		System.out.println(market.confirmOrder());

	}

}
