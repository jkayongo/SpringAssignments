package user.Registration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@EntityListeners(TimeTableListener.class)
@Table(name = "Teachers_Roster", schema = "kayongosdb")
public class TimeTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Teacher_id", length = 50, nullable = false, unique = false)
	int teaherId;
	@Column(name = "Teacher_name", length = 50, nullable = false, unique = false)
	String teacherName;
	@Column(name = "Subject", length = 50, nullable = false, unique = false)
	String subject;
	@Enumerated(EnumType.STRING)
	DaysOfTheWeek day;
	
	
	public TimeTable(String teacherName, String subject, DaysOfTheWeek day) {
		this.teacherName = teacherName;
		this.subject = subject;
		this.day = day;
	}
	public TimeTable() {
		
	}
	
	public int getTeaherId() {
		return teaherId;
	}



	public void setTeaherId(int teaherId) {
		this.teaherId = teaherId;
	}



	public String getTeacherName() {
		return teacherName;
	}



	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public DaysOfTheWeek getDay() {
		return day;
	}



	public void setDay(DaysOfTheWeek day) {
		this.day = day;
	}



	public static void main(String[] args) {
		//inserting/creating a record
		TimeTable timetable = new TimeTable("Kibirige Akram", "Physics", DaysOfTheWeek.MONDAY);
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sef = conf.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(timetable);
		//Retrieving an entity with id 10 of type TimeTable and updating it
		TimeTable entityToUpdate = session.get(TimeTable.class, 1);
		if(entityToUpdate != null) {
			entityToUpdate.setTeacherName("Wasswa Cornellius");
		}
		//Removing an entity
		TimeTable teacherToRemove = session.get(TimeTable.class, 18);
		if(teacherToRemove != null) {
			session.remove(teacherToRemove);
		}
		//reading a record
		List<TimeTable> entities = session.createQuery("from TimeTable",TimeTable.class).list();
		for(TimeTable entity : entities) {
			System.out.println(entity.getTeacherName() + " " + entity.getSubject() + " " + entity.day);
		}
		transaction.commit();
		session.close();
	}

}
