package componentrepositoryserviceannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//this is where the main logic happens
public class ProductService {
	ProductValidator productValidator;
	ProductRepository productRepository;
	//constructor based dependency
	@Autowired
	public ProductService(ProductValidator productValidator, ProductRepository productRepository) {
		this.productValidator = productValidator;
		this.productRepository = productRepository;
	}
	//checking for duplicates
	public String checkProductNames(Product product) {
		for(Product existingProduct : productRepository.retrieveAllProducts()) {
			if(productValidator.validateProductName(product.getProductName(), existingProduct.getProductName())) {
				return "Product exists.";
			}
		}
		productRepository.addProduct(product);
		return "Product added successfully.";
		
		
	}
	
	public List<Product> getAllProducts(){
		return productRepository.retrieveAllProducts();
	}
	
	
	
	
	

}
