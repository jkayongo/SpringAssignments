package coffee;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReadCoffeeGrowers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("coffeeGrowersPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List <CoffeeGrower> ugandanCoffeeGrowers = em.createQuery("SELECT e FROM CoffeeGrower e", CoffeeGrower.class).getResultList();
		for(CoffeeGrower ugandanCoffeeGrower : ugandanCoffeeGrowers) {
			System.out.println(ugandanCoffeeGrower.getName() + " " + ugandanCoffeeGrower.getTypeOfCoffee() + " " + ugandanCoffeeGrower.getQuantityProduced() + " " + ugandanCoffeeGrower.getResidence());
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

		
		

	}

}
