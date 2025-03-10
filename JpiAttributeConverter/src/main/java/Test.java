import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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

@Entity
@Table(name = "Development_Econ_Test_submission", schema = "kayongosdb")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id", length = 50, nullable = false, unique = false)
	private int studentId;
	@Column(name = "Student_name", length = 50, nullable = false, unique = false)
	private String studentName;
	@Column(name = "Test_name", length = 50, nullable = false, unique = false)
	private String testName;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Deadline", length = 50, nullable = false, unique = false)
	private Date deadline;
	@Temporal(TemporalType.DATE)
	private Calendar calendar;
	private LocalDate localDate;
	private LocalDateTime localDateTime;

	public Test(String studentName, String testName, Date deadline, Calendar calendar, LocalDate localDate, LocalDateTime localDateTime) {

		this.studentName = studentName;
		this.testName = testName;
		this.deadline = deadline;
		this.calendar = calendar;
		this.localDate = localDate;
		this.localDateTime = localDateTime;
		
	}

	public Test() {

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

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.setStudentName("Bagarukayo Charles");
		test.setTestName("Sociology");
		test.setDeadline(new Date());
		Calendar calendarDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		calendarDate.set(Calendar.YEAR, 2025);
		calendarDate.set(Calendar.MONTH, 0);
		calendarDate.set(Calendar.DAY_OF_MONTH, 4);
		test.setCalendar(calendarDate);
		test.setLocalDate(LocalDate.of(2026, 5, 28));
		test.setLocalDateTime(LocalDateTime.of(2027, 6, 14, 12, 0));
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sef = configuration.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(test);
		transaction.commit();
		session.close();

	}

}
