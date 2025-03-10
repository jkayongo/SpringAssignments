package operations;

import org.springframework.stereotype.Component;
@Component
public class FarmerOne implements FarmerOperations {
	public String operation1() {
		return "land preparation";
	}
	public String operation2() {
		return "sowing";
	}
	public String operation3() {
		return "pruning";
	}


}
