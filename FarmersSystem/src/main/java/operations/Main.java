package operations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigs.class);
//		FarmerOperations farmeroperations = context.getBean(FarmerOperations.class);
//		System.out.println(farmeroperations.operation1());
		FarmerTwo farmertwo = context.getBean(FarmerTwo.class);
		farmertwo.seasonActivity();
		FarmerFour farmerfour = context.getBean(FarmerFour.class);
		farmerfour.yourSeasonActivity();
	}

}
