package hoteldeliveriesworkspace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeliveryMainApp {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myhotel.xml");
		Kampala highestMarket = context.getBean(Kampala.class);
		highestMarket.areasWithTheMostOrders();
		context.close();

	}

}
