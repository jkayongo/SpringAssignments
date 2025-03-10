package customqualifier;
import org.springframework.stereotype.Component;
@CustomQualifier("StoreManager2")
@Component
public class StoreManager2 implements FarmStoreOperations {
	public String sortStock() {
		return "Stock not available at the moment,please wait";
	}
	public int stockAmount() {
		return 0;
	}
	public String loadStock() {
		return "Can't load stock now,no stock has been sorted";
	}
}
