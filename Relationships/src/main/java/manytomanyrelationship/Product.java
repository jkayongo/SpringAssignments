package manytomanyrelationship;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
@Entity
@Table(name = "Products", schema = "kayongosdb")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Product_name", length = 50, nullable = false, unique = false)
	private String productName;
	@Column(name = "Price", length = 50, nullable = false, unique = false)
	private int price;
	//a product can be linked to  multiple clients
	@ManyToMany(mappedBy = "products")
	private Set<Client> clients = new HashSet<>();
	
	public Product(String productName, int price, Set<Client> clients) {
		super();
		this.productName = productName;
		this.price = price;
		this.clients = clients;
	}
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	public static void main(String[] args) {
		

	}

}
