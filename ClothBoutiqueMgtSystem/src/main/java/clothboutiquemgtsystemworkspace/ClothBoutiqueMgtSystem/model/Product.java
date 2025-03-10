package clothboutiquemgtsystemworkspace.ClothBoutiqueMgtSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "cloth_boutique_products", schema = "jkayongodb")
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;
	@Column(name = "Name", nullable = false, unique = false)
	String name;
	@Column(name = "Description", nullable = false, unique = false)
	String description;
	@Column(name = "Price", nullable = false, unique = false)
	Double price;
	@Column(name = "Stock", nullable = false, unique = false)
	int stock;
	@Column(name = "Created_on", nullable = false, unique = false)
	Date createdOn;
	
	public Product() {
		
	}

	public Product(String name, String description, Double price, int stock, Date createdOn) {
		
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.createdOn = createdOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	
	

}
