package coffee;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("coffeeGrowersPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CoffeeGrower coffeeGrower = new CoffeeGrower();
		coffeeGrower.setName("Namboozo Sheila");
		coffeeGrower.setTypeOfCoffee("Arabica");
		coffeeGrower.setQuantityProduced(60000);
		coffeeGrower.setResidence("Mbale");
		em.persist(coffeeGrower);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		

	}

}
