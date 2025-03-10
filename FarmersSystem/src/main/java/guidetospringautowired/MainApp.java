package guidetospringautowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig.class);
		ExtensionOfficer extensionOfficer = context.getBean(ExtensionOfficer.class);
		extensionOfficer.licenseStatus();

	}

}
