package cityandresidentsonetomanyrelationship;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Residents", schema = "kayongosdb")
public class Resident {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Resident_id", length = 50, nullable = false, unique = false)
	private int residentId;
	@Column(name = "Resident_name", length = 50, nullable = false, unique = false)
	private String residentName;
	@Column(name = "Occupation", length = 50, nullable = false, unique = false)
	private String occupation;
	@ManyToOne
	@JoinColumn(name = "City_id", referencedColumnName = "City_id")
	private City city;
	
	public Resident(int residentId, String residentName, String occupation, City city) {
		this.residentId = residentId;
		this.residentName = residentName;
		this.occupation = occupation;
		this.city = city;
	}
	public Resident() {
		
	}
	

	public int getResidentId() {
		return residentId;
	}
	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}
	public String getResidentName() {
		return residentName;
	}
	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	//two resident objects are the same if they have the same resident name and occupation.
	public boolean equals(Object obj) {
				if(this == obj) return true;
				if(!(obj instanceof Resident)) return false;
				Resident myResident = (Resident) obj;
				return this.residentName.equals(myResident.residentName) && this.occupation.equals(myResident.occupation);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(residentName, occupation);
	}
	public static void main(String[] args) {
		

	}

}
