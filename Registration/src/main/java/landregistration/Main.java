package landregistration;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Owner owner = new Owner();
		owner.setOwnerName("Kyambadde Joab");
		owner.setTypeOfLand("Mailo");
		owner.setDateOfRegistration(LocalDateTime.of(2000, 5, 9, 2, 0));
		Calendar timeOfTitleIssuance = Calendar.getInstance();
		timeOfTitleIssuance.set(Calendar.YEAR,2001);
		timeOfTitleIssuance.set(Calendar.MONTH, 5);
		timeOfTitleIssuance.set(Calendar.DAY_OF_MONTH, 8);
		owner.setDateOfTitleIssuance(timeOfTitleIssuance);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(owner);
		transaction.commit();
		session.close();

	}

}
