package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.dao;

import java.util.List;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;

public interface PatientDao {
		//public String welcomeToRestControllers();
	    //saving the patient to the db
		public void savePatient(Patient patient);
		//getting all patients
		public List<Patient> getAllPatients();
		//getting a patient to update by id.This method will help us get the actual user to update
		public Patient getPatientById(int id);
		//actual updating will happen hear
		public void updatePatient(Patient patient);
		//deleting patients
		public void deletePatient(int id);
}
