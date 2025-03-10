package hajjiwifeanalogyforonetomanyrelationship;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HajjiWifeMainApp {

	public static void main(String[] args) {
		//create a hajji with no wife
		Hajji hajji = new Hajji();
		hajji.setNameOftheHajji("Aine Hababu");
		hajji.setAge(28);
		hajji.setJob("Economist");
		
		//create two wife instances
		Wife wife1 = new Wife();
		wife1.setWifeName("Shadiah Zalwango");
		wife1.setResidence("Nansana");
		Wife wife2 = new Wife();
		wife2.setWifeName("Shadiah Zalwango");
		wife2.setResidence("Nansana");
		
		
		
		//give the wives a Hajji
		wife1.setHajji(hajji);
		wife2.setHajji(hajji);
		//put the wives in a list
		Set<Wife> hajjisWives = new HashSet<>();
		hajjisWives.add(wife1);
		hajjisWives.add(wife2);
		
		
		//Give Hajji  wives
		hajji.setWives(hajjisWives);
		
		//configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sef = configuration.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(hajji);
		transaction.commit();
		session.close();
		
		
		
		

	}

}
