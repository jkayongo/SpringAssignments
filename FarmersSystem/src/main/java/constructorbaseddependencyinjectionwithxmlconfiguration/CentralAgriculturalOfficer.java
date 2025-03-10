package constructorbaseddependencyinjectionwithxmlconfiguration;

public class CentralAgriculturalOfficer {
	AgriculturalOfficer name;
	
	public CentralAgriculturalOfficer(AgriculturalOfficer name) {
		
		this.name = name;
	}
	public CentralAgriculturalOfficer() {
		
	}
	public String inChargeAgriculturalOfficer() {
		return "The produce has been approved by" + name.getAgriculturalOfficerName();
	}
	

	
}
