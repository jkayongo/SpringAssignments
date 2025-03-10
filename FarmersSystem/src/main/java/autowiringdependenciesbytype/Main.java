package autowiringdependenciesbytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vendor vendor = context.getBean(Vendor.class);
		vendor.checkStatus();
		  

	}

}
