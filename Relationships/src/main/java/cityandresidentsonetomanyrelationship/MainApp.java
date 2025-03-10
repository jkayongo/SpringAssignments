package cityandresidentsonetomanyrelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//create a city
		City city1 = new City();
		city1.setCityName("Masaka");
		//create residents
		Resident resident1 = new Resident();
		resident1.setResidentName("Cranmar Kyambadde");
		resident1.setOccupation("Medical doctor");
		resident1.setCity(city1);
		Resident resident2 = new Resident();
		resident2.setResidentName("Nakabugo Joyce");
		resident2.setOccupation("Sales manager");
		resident2.setCity(city1);
		Resident resident3 = new Resident();
		resident3.setResidentName("Kasule Collins Conrad");
		resident3.setOccupation("Electrical engineer");
		resident3.setCity(city1);
		Resident resident4 = new Resident();
		resident4.setResidentName("Amutuhaire Esther");
		resident4.setOccupation("Accountant");
		resident4.setCity(city1);
		Resident resident5 = new Resident();
		resident5.setResidentName("Uwamaria Celine Rafiki");
		resident5.setOccupation("Software engineer");
		resident5.setCity(city1);
		//put the residents in a list
		List<Resident> residentsOfCity1 = new ArrayList<>();
		residentsOfCity1.add(resident1);
		residentsOfCity1.add(resident2);
		residentsOfCity1.add(resident3);
		residentsOfCity1.add(resident4);
		residentsOfCity1.add(resident5);
		//give a city its residents
		city1.setResidents(residentsOfCity1);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(city1);
		transaction.commit();
		session.close();
		
		
		

	}

}
