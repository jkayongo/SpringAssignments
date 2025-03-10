package autowiredresourceandinject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppForFertilizerUsage {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForFertilizerUsage.class);
		FertilizerUsageApp fertilizer = context.getBean(FertilizerUsageApp.class);
		fertilizer.fertilizerStatus();

	}

}
