package voters.VotersSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.getEnvironment().setActiveProfiles("test");
    	context.register(VoterSystemConfig.class);
    	context.refresh(); // this reloads the application context to create anly the specified bean
    	context.getBean(Flexipay.class).balance();

	}

}
