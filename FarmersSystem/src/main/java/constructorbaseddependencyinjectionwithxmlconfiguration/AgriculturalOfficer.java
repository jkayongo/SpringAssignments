package constructorbaseddependencyinjectionwithxmlconfiguration;

public class AgriculturalOfficer {
	int agriculturalOfficerId;
	String agriculturalOfficerName;
	
	

	public AgriculturalOfficer(int agriculturalOfficerId, String agriculturalOfficerName) {
		
		this.agriculturalOfficerId = agriculturalOfficerId;
		this.agriculturalOfficerName = agriculturalOfficerName;
	}
	public AgriculturalOfficer() {
		
	}
	public String notification() {
		return "You " + agriculturalOfficerId + " " + agriculturalOfficerName + " " + "has been registered as an agricultural officer";
	}


	public int getAgriculturalOfficerId() {
		return agriculturalOfficerId;
	}
	public void setAgriculturalOfficerId(int agriculturalOfficerId) {
		this.agriculturalOfficerId = agriculturalOfficerId;
	}
	public String getAgriculturalOfficerName() {
		return agriculturalOfficerName;
	}
	public void setAgriculturalOfficerName(String agriculturalOfficerName) {
		this.agriculturalOfficerName = agriculturalOfficerName;
	}
	public static void main(String[] args) {
		

	}

}
