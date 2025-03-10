package operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FarmerTwo {
	@Autowired
	@Qualifier("farmerOne")
	FarmerOperations farmoperations;
	public void seasonActivity() {
		System.out.println(farmoperations.operation2());
	}

}
