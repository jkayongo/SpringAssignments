package hajjiwifeanalogyforonetomanyrelationship;

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
@Table(name = "Wives", schema = "kayongosdb")
public class Wife {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Name", length = 50, nullable = false, unique = false)
	private String wifeName;
	@Column(name = "Residence", length = 50, nullable = false, unique = false)
	private String residence;
	@ManyToOne
	@JoinColumn(name = "Hajji_id", referencedColumnName = "id") //Hajji_id acts as a bridge that connects each wife to the right Hajji
	private Hajji hajji;
	public Wife(String wifeName, String residence, Hajji hajji) {
		this.wifeName = wifeName;
		this.residence = residence;
		this.hajji = hajji;
	}
	public Wife() {
		
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public Hajji getHajji() {
		return hajji;
	}
	public void setHajji(Hajji hajji) {
		this.hajji = hajji;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Wife)) return false;
		Wife wife = (Wife) obj;
		return this.wifeName.equals(wife.wifeName) && this.residence.equals(wife.residence);
	}
	@Override
	public int hashCode() {
		//Two objects with the same field values(wifeName, residence) produce the same hash code.
		return Objects.hash(wifeName, residence);
	}
	
	public static void main(String[] args) {
		

	}

}
