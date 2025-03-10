package persistingenums;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Intern_doctors_roster")
public class DoctorsRoster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Doctor_id", length = 50, nullable = false, unique = false)
	private int doctorId;
	@Column(name = "Doctor_name", length = 50, nullable = false, unique = false)
	private String doctorName;
	@Column(name = "Day_on_duty", length = 50, nullable = false, unique = false)
	@Convert(converter = DaysOfTheWeekConverter.class)
	private DaysOfTheWeek dayOnDuty;
	

	public DoctorsRoster(String doctorName, DaysOfTheWeek dayOnDuty) {

		this.doctorName = doctorName;
		this.dayOnDuty = dayOnDuty;
	}
	public DoctorsRoster() {
		
	}


	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public DaysOfTheWeek getDayOnDuty() {
		return dayOnDuty;
	}



	public void setDayOnDuty(DaysOfTheWeek dayOnDuty) {
		this.dayOnDuty = dayOnDuty;
	}



	public static void main(String[] args) {
		DoctorsRoster internDoctor = new DoctorsRoster();
		internDoctor.setDoctorName("Kato John");
		internDoctor.setDayOnDuty(DaysOfTheWeek.FRIDAY);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sef = configuration.buildSessionFactory();
		Session session = sef.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(internDoctor);
		transaction.commit();
		session.close();

	}

}
