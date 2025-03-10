package autowiringdependenciesbyconstructor;

public class CoffeeBrewer {
	CoffeeFarmer coffeefarmer;
	public CoffeeBrewer(CoffeeFarmer coffeefarmer) {
		this.coffeefarmer = coffeefarmer;
	}
	public void checkCoffeeStock() {
		System.out.println("Welcome!" + coffeefarmer.coffeeAlert());
	}

}
