package user.Registration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudClass {
	//build and return a session factory
	public static SessionFactory configuration() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = conf.buildSessionFactory();
		return sessionFactory;
	}
	public void updateRecord() {
		try {
			Session session = CrudClass.configuration().openSession();
			Transaction transaction = session.beginTransaction();
			//retrieving record to update.
			TimeTable entityToUpdate = session.get(TimeTable.class, 8);
			if(entityToUpdate != null) {
				entityToUpdate.setTeacherName("Nampeera Owempere");
				entityToUpdate.setSubject("Luganda");
				transaction.commit();
		}
		}catch(Exception error) {
			
		}
		}
	
	public void deleteRecord() {
		TimeTable teacherToRemove = session.get(TimeTable.class, 18);
		if(teacherToRemove != null) {
			session.remove(teacherToRemove);
		}
	}
	public void readRecords() {
		List<TimeTable> entities = session.createQuery("from TimeTable",TimeTable.class).list();
		for(TimeTable entity : entities) {
			System.out.println(entity.getTeacherName() + " " + entity.getSubject() + " " + entity.day);
		}

	}

	public static void main(String[] args) {
		

	}

}
