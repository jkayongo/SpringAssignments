package autowiringdependenciesbytype;

public class Vendor {
	Producer producer;
	//setter for injecting the dependency
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	public void checkStatus() {
		System.out.println("Status: " + producer.produceAlert());
	}

}
