package embedableandembeded.UnderstandingEmbedableAndEmbeded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EngineeringDepartment engineer = new EngineeringDepartment("Robert Ssemuli", "Frontend engineer", new Supervisor("Opio Drake", "opiodrake@gmail.com", 256765896289L));
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sef = configuration.buildSessionFactory();
    	Session session = sef.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(engineer);
    	transaction.commit();
    	session.close();
    	    	
    }
}
