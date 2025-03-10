package landregistration;

import java.time.LocalDateTime;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Land_owners", schema = "kayongosdb")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Owner's_id", length = 50, nullable = false, unique = false)
	private int ownerId;
	@Column(name = "Owner's_name", length = 50, nullable = false, unique = false)
	private String ownerName;
	@Column(name = "Type_of_land", length = 50, nullable = false, unique = false)
	private String typeOfLand;
	@Column(name = "Date_of_registration", length = 50, nullable = false, unique = false)
	private LocalDateTime dateOfRegistration;
	@Column(name = "Date_of_title_issuance", length = 50, nullable = false, unique = false)
	private Calendar dateOfTitleIssuance;
	

	public Owner(String ownerName, String typeOfLand, LocalDateTime dateOfRegistration, Calendar dateOfTitleIssuance) {
		
		this.ownerName = ownerName;
		this.typeOfLand = typeOfLand;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfTitleIssuance = dateOfTitleIssuance;
	}
	public Owner() {
		
	}
	


	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getTypeOfLand() {
		return typeOfLand;
	}
	public void setTypeOfLand(String typeOfLand) {
		this.typeOfLand = typeOfLand;
	}
	public LocalDateTime getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public Calendar getDateOfTitleIssuance() {
		return dateOfTitleIssuance;
	}
	public void setDateOfTitleIssuance(Calendar dateOfTitleIssuance) {
		this.dateOfTitleIssuance = dateOfTitleIssuance;
	}
	public static void main(String[] args) {
		

	}

}
