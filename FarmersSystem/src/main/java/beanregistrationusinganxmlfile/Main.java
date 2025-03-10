package beanregistrationusinganxmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	  

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Matooke matooke = (Matooke) context.getBean("matooke");
		System.out.println(matooke.message());
		
		  

	}

}
