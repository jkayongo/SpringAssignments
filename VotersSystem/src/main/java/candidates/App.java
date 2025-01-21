package candidates;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "flexi"); 
	      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profile.xml");
	      President president = context.getBean(President.class);
	      president.nominate();
	      context.close();

	}

}
