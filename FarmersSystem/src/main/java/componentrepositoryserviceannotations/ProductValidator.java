package componentrepositoryserviceannotations;

import org.springframework.stereotype.Component;

@Component
public class ProductValidator {
	//validating two product names
		//if two productName1 is the same as productName2,return true else false.
		public boolean validateProductName(String productName1, String productName2) {
			return productName1.equals(productName2);
		}

}
