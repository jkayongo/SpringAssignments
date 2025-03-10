package hajjiwifeanalogyforonetomanyrelationship;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hajji", schema = "kayongosdb")
public class Hajji {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", length = 50, nullable = false, unique = false)
	private int id;
	@Column(name = "Name of the Hajji", length = 50, nullable = false, unique = false)
	private String nameOftheHajji;
	@Column(name = "Age", length = 50, nullable = false, unique = false)
	private int age;
	@Column(name = "Job", length = 50, nullable = false, unique = false)
	private String job;
	@OneToMany(mappedBy = "hajji", cascade = CascadeType.ALL) //one hajji can have multiple wives
	private Set<Wife> wives = new HashSet<>();//  this is the list of hajji's wives
	
	public Hajji(String nameOftheHajji, int age, String job, Set<Wife> wives) {
		this.nameOftheHajji = nameOftheHajji;
		this.age = age;
		this.job = job;
		this.wives = wives;
	}
    
	public Hajji() {
		
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOftheHajji() {
		return nameOftheHajji;
	}
	public void setNameOftheHajji(String nameOftheHajji) {
		this.nameOftheHajji = nameOftheHajji;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Set<Wife> getWives() {
		return wives;
	}
	public void setWives(Set<Wife> wives) {
		this.wives = wives;
	}
	public static void main(String[] args) {
		

	}

}
