package manytomanyrelationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeleteRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomanyrelationshippersistentunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Client clientToDelete = em.find(Client.class, 4);
		if(clientToDelete != null) {
			em.remove(clientToDelete);
			System.out.println("Client removed successfully.");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
