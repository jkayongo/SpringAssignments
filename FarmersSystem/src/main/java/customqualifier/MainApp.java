package customqualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StoreManagersApp storeManager = context.getBean(StoreManagersApp.class);
		storeManager.showStoreManagerStatus();
		

	}

}
