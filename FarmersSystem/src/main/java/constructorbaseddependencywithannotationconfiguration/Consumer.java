package constructorbaseddependencywithannotationconfiguration;

public class Consumer {
	Supplier supplier;
	String nameOfTheConsumer;
	String typeOfProductBought;
	String quantityBrought;
	//constructor based dependency
	//the Consumer class has a constructor that takes on a Supplier object
	public Consumer(Supplier supplier) {
		this.supplier = supplier;
	}
	public void notification() {
		System.out.println("you have a new notification: " + supplier.productAlert());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
