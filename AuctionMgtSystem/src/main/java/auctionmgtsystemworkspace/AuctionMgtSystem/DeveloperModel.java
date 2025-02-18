package auctionmgtsystemworkspace.AuctionMgtSystem;

public class DeveloperModel {
	String developerName;
	int developerAge;
	public DeveloperModel(String developerName, int developerAge) {
		super();
		this.developerName = developerName;
		this.developerAge = developerAge;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public int getDeveloperAge() {
		return developerAge;
	}
	public void setDeveloperAge(int developerAge) {
		this.developerAge = developerAge;
	}
	

}
