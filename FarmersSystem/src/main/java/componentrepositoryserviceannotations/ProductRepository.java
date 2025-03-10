package componentrepositoryserviceannotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
//this class is responsible for adding and retrieving products
public class ProductRepository {
	List<Product> products = new ArrayList<>();
	//method adding a product to the list
	public void addProduct(Product product) {
		products.add(product);
	}
	//method to retrieve all products all products
	public List<Product> retrieveAllProducts(){
		return products;
	}

}
