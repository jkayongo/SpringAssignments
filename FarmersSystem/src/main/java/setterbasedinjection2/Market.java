package setterbasedinjection2;

public class Market {
	Crop region;
	public  Market() {
		
	}
	
	public String confirmOrder() {
		return "vegetables have been recieved.";
	}

	public Crop getRegion() {
		return region;
	}


	public void setRegion(Crop crop) {
		this.region = crop;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
