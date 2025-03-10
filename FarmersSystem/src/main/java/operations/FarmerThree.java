package operations;


import org.springframework.stereotype.Component;

@Component
public class FarmerThree implements FarmerOperations {
	public String operation1() {
		return "sorting";
	}
	public String operation2() {
		return "packaging";
		
	}
	public String operation3() {
		return "branding";
	}


	public static void main(String[] args) {
		

	}

}
