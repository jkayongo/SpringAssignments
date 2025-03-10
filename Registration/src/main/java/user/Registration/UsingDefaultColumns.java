package user.Registration;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "Madhivani_Group", schema = "kayongosdb")
public class UsingDefaultColumns {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int groupId;
	@ColumnDefault("Madhivani")
	String firstName;
	@Column(name = "Last_name", length = 50)
	String lastName;
	
	public UsingDefaultColumns(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//default constructor.
	public UsingDefaultColumns() {
		
	}
	

	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
		this.groupId = groupId;
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


	public static void main(String[] args) {
		UsingDefaultColumns worker = new UsingDefaultColumns();
		worker.setLastName("Nnakumussana");
		worker.setFirstName("Ssebuliba");
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sef = conf.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(worker);
		transaction.commit();
		session.close();
		
	}

}
