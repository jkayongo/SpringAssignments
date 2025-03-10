package coffee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coffee_growers", schema = "kayongosdb")
public class CoffeeGrower {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	int id;
	@Column(name = "Name", length = 50, nullable = false, unique = false)
	String name;
	@Column(name = "Type of coffee", length = 50, nullable = false, unique = false)
	String typeOfCoffee;
	@Column(name = "Quantity produced", length = 50, nullable = false, unique = false)
	int quantityProduced;
	@Column(name = "Residence", length = 50, nullable = false, unique = false)
	String residence;
	

	public CoffeeGrower(String name, String typeOfCoffee, int quantityProduced, String residence) {
		super();
		this.name = name;
		this.typeOfCoffee = typeOfCoffee;
		this.quantityProduced = quantityProduced;
		this.residence = residence;
	}
	
	public CoffeeGrower() {
		
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

	public String getTypeOfCoffee() {
		return typeOfCoffee;
	}

	public void setTypeOfCoffee(String typeOfCoffee) {
		this.typeOfCoffee = typeOfCoffee;
	}

	public int getQuantityProduced() {
		return quantityProduced;
	}

	public void setQuantityProduced(int quantityProduced) {
		this.quantityProduced = quantityProduced;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public static void main(String[] args) {
		
		
		

	}

}
