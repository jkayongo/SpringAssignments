package autowiringdependencies;

public class Market {
	String marketLocation;
	Stock stock;
	//the setter method allows Spring to inject the dependency.
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void notification() {
		System.out.println("Notification: " + stock.stockAlert());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
