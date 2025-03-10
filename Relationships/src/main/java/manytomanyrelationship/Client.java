package manytomanyrelationship;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
@Entity
@Table(name = "Clients", schema = "kayongosdb")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Client_id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Client_name", length = 50, nullable = false, unique = false)
	private String clientName;
	@Column(name = "Age", length = 50, nullable = false, unique = false)
	private int age;
	@Column(name = "Residence", length = 50, nullable = false, unique = false)
	private String residence;
	// a client can be linked to multiple products
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Client_Product", //join table to store the relationship.Client_Product stores associations between client and product
	        joinColumns = @JoinColumn(name = "Client_id"),
	        inverseJoinColumns = @JoinColumn(name = "Product_id")
	    )
	private Set<Product> products = new HashSet<>();
	
	public Client(String clientName, int age, String residence, Set<Product> products) {
		super();
		this.clientName = clientName;
		this.age = age;
		this.residence = residence;
		this.products = products;
	}
	public Client() {
		
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public static void main(String[] args) {
		

	}

}
