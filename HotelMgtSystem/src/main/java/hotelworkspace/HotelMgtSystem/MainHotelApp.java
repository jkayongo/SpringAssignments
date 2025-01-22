package hotelworkspace.HotelMgtSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHotelApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(HotelConfig.class);
		context.refresh();
		context.getBean(Client.class).welcome();

	}

}
