package MyProject.learningmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentLeaders {
	@Id
	int studentLeaderId;
	String name;
	String email;
	int phoneNumber;
	String residence;
	public StudentLeaders(int studentLeaderId, String name, String email, int phoneNumber, String residence) {
		this.studentLeaderId = studentLeaderId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.residence = residence;
	}

	public int getStudentLeaderId() {
		return studentLeaderId;
	}

	public void setStudentLeaderId(int studentLeaderId) {
		this.studentLeaderId = studentLeaderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}
	@Override
	public String toString() {
		return "StudentLeaders [studentLeaderId=" + studentLeaderId + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", residence=" + residence + "]";
	}

	public static void main(String[] args) {
		StudentLeaders studentLeaders = new StudentLeaders(1, "Ronnie Ssentamu", "ronnieSsentamu@gmail.com", 709865423, "University Hall");
		 
		  Configuration conf = new Configuration();
		  conf.configure("hibernate.cfg.xml");
		  SessionFactory sef = conf.buildSessionFactory();
		  Session session= sef.openSession();
		  Transaction transaction = session.beginTransaction();  // Start the transaction
		  session.persist(studentLeaders);
		  transaction.commit();  // Commit the transaction
		  session.close();  // Close t
		

	}

}
