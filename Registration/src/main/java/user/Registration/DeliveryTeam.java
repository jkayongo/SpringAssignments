package user.Registration;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "Human_Resource" , schema = "kayongosdb")
public class DeliveryTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Personal_id", length = 50, nullable = false, unique = false)
	private int personId;
	@Column(name = "Name", length = 50, nullable = false, unique = false)
	private String personalName;
	@ColumnDefault(" 'Delivery' ")
	@Column(name = "Role")
	private String role;
	@ColumnDefault("600000")
	@Column(name = "Salary")
	private int salary;
	@Column(name = "Date_of_registration")
	private LocalDate dateOfRegistration;
	
	public DeliveryTeam(String personalName, String role, int salary, LocalDate dateOfRegistration) {
		this.personalName = personalName;
		this.role = role;
		this.salary = salary;
		this.dateOfRegistration = dateOfRegistration;
	}
	//default constructor, why need a default constructor
	public DeliveryTeam() {
		
	}
	@PrePersist
	public void  registrationDate() {
		 this.dateOfRegistration = LocalDate.now();
		 this.role = "Marketing manager";
	}

	public int getPersonId() {
		return personId;
	}



	public void setPersonId(int personId) {
		this.personId = personId;
	}



	public String getPersonalName() {
		return personalName;
	}



	public void setPersonalName(String personalName) {
		this.personalName = personalName;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}



	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}




	public static void main(String[] args) {
		DeliveryTeam person = new DeliveryTeam();
		person.setPersonalName("Ricky Ssenabulya");
		person.setRole("Forwarding agent");
		person.setSalary(500000);
		person.setDateOfRegistration(LocalDate.of(2024, 5, 9));
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		//build a session factory object
		SessionFactory sef = conf.buildSessionFactory();
		// build a session object
		Session session = sef.openSession();
		// build a transaction object
		Transaction transaction = session.beginTransaction();
		session.persist(person);
//		DeliveryTeam personToDelete = session.get(DeliveryTeam.class, 1);
//		if(personToDelete != null) {
//			session.remove(personToDelete);
//		}
		transaction.commit();
		session.close();
		
		

	}

}
