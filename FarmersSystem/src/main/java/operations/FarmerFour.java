package operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FarmerFour {
	@Autowired
	@Qualifier("farmerThree")
	FarmerOperations farmeroperations;
	public void yourSeasonActivity() {
		System.out.println("Activity: " + farmeroperations.operation1());
	}

}
