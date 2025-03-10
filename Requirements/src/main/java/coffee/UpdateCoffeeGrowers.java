package coffee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UpdateCoffeeGrowers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("coffeeGrowersPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CoffeeGrower updateCoffeeGrower = em.find(CoffeeGrower.class, 2);
		if(updateCoffeeGrower != null ) {
			updateCoffeeGrower.setName("Nakamatte Keylene");
			updateCoffeeGrower.setResidence("Kyanamukaaka");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
