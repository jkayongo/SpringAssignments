package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.service;

import java.util.List;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;

public interface PatientService {
	public void savePatient(Patient patient);
	public List<Patient> getAllPatients();
	public Patient getPatientById(int id);
	public void deletePatient(int id);
	public void updatePatient(Patient patient);
	
}
