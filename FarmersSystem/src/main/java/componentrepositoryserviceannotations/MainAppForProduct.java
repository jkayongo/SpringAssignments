package componentrepositoryserviceannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainAppForProduct {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductService productService = context.getBean(ProductService.class);
		System.out.println(productService.checkProductNames(new Product(6, "burger")));
		System.out.println(productService.checkProductNames(new Product(8, "pizza")));
		System.out.println(productService.checkProductNames(new Product(9, "milk shake")));
		System.out.println(productService.checkProductNames(new Product(10, "milk shake")));
		System.out.println(productService.checkProductNames(new Product(11, "Ormlet")));
		System.out.println("Product listing: " + productService.getAllProducts());
		

	}

}
