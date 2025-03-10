package farmrecords;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("myproject.xml");
		Farmer2 farmer2 = context.getBean(Farmer2.class);
		farmer2.alertFarmer2();

	}

}
