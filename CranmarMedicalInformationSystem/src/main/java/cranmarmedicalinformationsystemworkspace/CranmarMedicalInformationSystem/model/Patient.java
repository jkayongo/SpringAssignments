package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "patientsDb" , schema = "jkayongodb")
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Patient_id",  nullable = false, unique = false)
	int patientId;
	@Column(name = "Patient_name",  nullable = false, unique = false)
	String patientName;
	@Column(name = "Patient_age",  nullable = false, unique = false)
	int patientAge;
	@Column(name = "Diagnosis", nullable = false, unique = false)
	String diagonosis;
	@Column(name = "Residence",  nullable = false, unique = false)
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
