package customqualifier;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
@CustomQualifier("StoreManager1")
@Component
public class StoreManager1 implements FarmStoreOperations {
	public String sortStock() {
		return "Stock available,start sorting.";
	}
	public int stockAmount() {
		return 2000;
	}
	public String loadStock() {
		return "loading stock in progress";
	}


}
