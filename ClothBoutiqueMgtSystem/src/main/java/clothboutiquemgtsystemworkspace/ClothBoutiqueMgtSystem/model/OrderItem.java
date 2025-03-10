package clothboutiquemgtsystemworkspace.ClothBoutiqueMgtSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cloth_boutique_order_items", schema = "jkayongodb")
@Entity
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;
	@Column(name = "Order_id", nullable = false, unique = false)
	int orderId;
	@Column(name = "Product_id", nullable = false, unique = false)
	int productId;
	@Column(name = "Quantity", nullable = false, unique = false)
	int quantity;
	@Column(name = "Price", nullable = false, unique = false)
	Double price;
	
	public OrderItem() {
		
	}

	public OrderItem(int orderId, int productId, int quantity, Double price) {
		
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
