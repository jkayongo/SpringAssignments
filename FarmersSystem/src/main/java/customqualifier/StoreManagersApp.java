package customqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StoreManagersApp {
	@Autowired
	@CustomQualifier("StoreManager1") 
	FarmStoreOperations storeManager1;
	@Autowired
	@CustomQualifier("StoreManager2")
	FarmStoreOperations storeManager2;
	public void showStoreManagerStatus() {
		System.out.println("Store manager 1 status:" + storeManager1.sortStock() + " " + storeManager1.stockAmount() + " " + storeManager1.loadStock());
		System.out.println("Store manager 2 status:" + storeManager2.sortStock() + " " + storeManager2.stockAmount() + " " + storeManager2.loadStock());
	}

}
