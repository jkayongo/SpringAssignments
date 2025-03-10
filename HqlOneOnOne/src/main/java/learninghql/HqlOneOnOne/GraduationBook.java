package learninghql.HqlOneOnOne;

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

@Entity
@Table(name = "Graduation_book", schema = "kayongosdb")
public class GraduationBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id", length = 50, nullable = false, unique = false)
	private int studentId;
	@Column(name = "Student_name", length = 50, nullable = false, unique = false)
	private String studentName;
	@Column(name = "Age", length = 50, nullable = false, unique = false)
	private int age;
	@Column(name = "Degree", length = 50, nullable = false, unique = false)
	private String degree;
	@Column(name = "Grade", length = 50, nullable = false, unique = false)
	private String grade;
	
	
	

	public GraduationBook(String studentName, int age, String degree, String grade) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.degree = degree;
		this.grade = grade;
	}
	
	public GraduationBook() {
		
	}
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		GraduationBook student = new GraduationBook();
		student.setStudentName("");
		student.setAge(0);
		student.setDegree("");
		student.setGrade("");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sef = configuration.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(student);
		System.out.println("You have successfully added a student to the graduation book");
		transaction.commit();
		session.close();
		
		
		

	}

}
