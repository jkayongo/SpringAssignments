package user.Registration;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
@Entity
@Table(name = "Users", schema = "kayongosdb")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userId;
	 @Column(name="First_name", length=50, nullable=false, unique=false)
	String firstName;
	 @Column(name="Last_name", length=50, nullable=false, unique=false)
	String lastName;
	@Column(name = "Date of birth", length=50, nullable=false, unique=false)
	@Temporal(TemporalType.DATE)
	Date dateOfBirth;
	@Transient
	int currentAge;
	public User(String firstName, String lastName, Date dateOfBirth, int currentAge) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.currentAge = currentAge;
	}
	public User() {
		
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}
	public int age(Date dateOfBirth ) {
		// convert dateOfBirth to LocalDate
		LocalDate birthDate = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		// get current date
		LocalDate currentDate = LocalDate.now();
		//get difference between currentDate and birthDate
		int age = Period.between(birthDate, currentDate).getYears();
		return age;
	}

	public static void main(String[] args) {
		User user = new User("Ismael", "Kasaddah", new Date("1996/12/8"), 24);
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sef = conf.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(user);
		transaction.commit();
		session.close();

	}

}
