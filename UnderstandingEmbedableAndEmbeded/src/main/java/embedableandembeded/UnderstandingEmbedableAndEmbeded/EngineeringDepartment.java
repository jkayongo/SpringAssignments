package embedableandembeded.UnderstandingEmbedableAndEmbeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Engineering_department", schema = "kayongosdb")
public class EngineeringDepartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Engineer_id", length = 50, nullable = false, unique = false)
	private int engineerId;
	@Column(name = "Engineer_name", length = 50, nullable = false, unique = false)
	private String engineerName;
	@Column(name = "Role", length = 50, nullable = false, unique = false)
	private String role;
	@Embedded
	private Supervisor supervisor;
	

	public EngineeringDepartment(String engineerName, String role, Supervisor supervisor) {
		
		this.engineerName = engineerName;
		this.role = role;
		this.supervisor = supervisor;
	}
	public EngineeringDepartment() {
		
	}
	


	public int getEngineerId() {
		return engineerId;
	}



	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}



	public String getEngineerName() {
		return engineerName;
	}



	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public Supervisor getSupervisor() {
		return supervisor;
	}



	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}



	public static void main(String[] args) {
		

	}

}
