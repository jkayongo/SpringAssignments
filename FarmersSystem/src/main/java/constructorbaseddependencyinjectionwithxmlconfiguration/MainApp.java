package constructorbaseddependencyinjectionwithxmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		CentralAgriculturalOfficer centralAgriculturalOfficer = context.getBean(CentralAgriculturalOfficer.class); 
		System.out.println(centralAgriculturalOfficer.inChargeAgriculturalOfficer());
		AgriculturalOfficer agriculturalOfficer = context.getBean(AgriculturalOfficer.class);
		System.out.println(agriculturalOfficer.notification());
		

	}

}
