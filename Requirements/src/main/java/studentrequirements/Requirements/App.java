package studentrequirements.Requirements;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("schoolRequirements"); 
    	  EntityManager em = emf.createEntityManager(); 
    	  em.getTransaction().begin(); 
    	  StdRequirements requirements = new StdRequirements("class uniform", 400000, "Metallic", 12); 
    	  
    	  em.persist(requirements); 
    	  em.getTransaction().commit(); 
    	  em.close(); 
    	  emf.close();
    }
}
