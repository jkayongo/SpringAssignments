package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
@Table(name = "patientsDb" , schema = "jkayongodb")
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Patient_id")
	int patientId;
	@Column(name = "Patient_name",  nullable = false, unique = false)
	@NotEmpty(message = "Name must not be blank.")
	String patientName;
	@Column(name = "Patient_age",  nullable = false, unique = false)
	@Min(value = 1 , message = "Age must atleast be 1.")
	@Max(value = 125, message = "Age cannot exceed 125.")
	int patientAge;
	@Column(name = "Diagnosis", nullable = false, unique = false)
	@NotEmpty(message = "Diagonosis is required.")
	String diagonosis;
	@Column(name = "Residence",  nullable = false, unique = false)
	@NotEmpty(message = "Residence is required.")
	String residence;
	
	public Patient() {
		
	}
	
	public Patient(String patientName, int patientAge, String diagonosis, String residence) {
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.diagonosis = diagonosis;
		this.residence = residence;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getDiagonosis() {
		return diagonosis;
	}

	public void setDiagonosis(String diagonosis) {
		this.diagonosis = diagonosis;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}
	
	
	
}
