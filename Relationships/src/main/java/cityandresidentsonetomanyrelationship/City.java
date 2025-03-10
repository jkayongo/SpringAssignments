package cityandresidentsonetomanyrelationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Cities", schema = "kayongosdb")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "City_id", length = 50, nullable = false, unique = false)
	private int cityId;
	@Column(name = "City_name", length = 50, nullable = false, unique = false)
	private String cityName;
	@OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
	private List<Resident> residents = new ArrayList<>();
	

	public City(String cityName, List<Resident> residents) {
		
		this.cityName = cityName;
		this.residents = residents;
	}
	
	public City() {
		
	}
	


	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Resident> getResidents() {
		return residents;
	}

	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}
	
	//two objects are the same if they have the same city name
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; 
 		if (!(obj instanceof City)) return false;
		City myCity = (City) obj;
		return this.cityName == myCity.cityName;
		
	}
	

	
	@Override
	public int hashCode() {
		return cityName.hashCode();
	}

	public static void main(String[] args) {
			}

}
