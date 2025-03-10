package learningjpiattributeconverter.JpiAttributeConverter;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create a contact object
    	Contact contact = new Contact();
    	contact.setPhoneNumber("");
    	contact.setEmail("");
    	//create a student object
    	Student student = new Student();
    	student.setStudentName("");
    	student.setCourse("");
    	student.setContact(contact);
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sef = configuration.buildSessionFactory();
    	Session session = sef.openSession();
    	Transaction transaction = session.beginTransaction();
    	Query<Student> query = session.createQuery("FROM Student", Student.class);
    	List<Student> students = query.list();
    	for(Student individualStudent : students) {
    		System.out.println(individualStudent.getStudentId() + " " + individualStudent.getStudentName() + " " + individualStudent.getCourse() + " " + individualStudent.getContact().getEmail() + " " + individualStudent.getContact().getPhoneNumber());
    	}
    	//session.persist(student);
    	transaction.commit();
    	session.close();
    	
    	
    }
}
