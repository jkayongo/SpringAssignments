package clothboutiquemgtsystemworkspace.ClothBoutiqueMgtSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "cloth_boutique_orders", schema = "jkayongodb")
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;
	@Column(name = "Customer_id", nullable = false, unique = false)
	int customerId;
	@Column(name = "Order_date", nullable = false, unique = false)
	Date orderDate;
	@Column(name = "Status", nullable = false, unique = false)
	String status;
	@Column(name = "Total_amount", nullable = false, unique = false)
	Double totalAmount;
	
	public Order() {
		
	}

	public Order(int customerId, Date orderDate, String status, Double totalAmount) {
		
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.status = status;
		this.totalAmount = totalAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
