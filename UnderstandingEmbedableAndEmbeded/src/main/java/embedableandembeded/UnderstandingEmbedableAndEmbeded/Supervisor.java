package embedableandembeded.UnderstandingEmbedableAndEmbeded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Supervisor {
	private String supervisorName;
	private String email;
	private Long phoneNumber;
	

	public Supervisor(String supervisorName, String email, Long phoneNumber) {
		
		this.supervisorName = supervisorName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Supervisor() {
		
	}


	public String getSupervisorName() {
		return supervisorName;
	}



	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public static void main(String[] args) {
		

	}

}
