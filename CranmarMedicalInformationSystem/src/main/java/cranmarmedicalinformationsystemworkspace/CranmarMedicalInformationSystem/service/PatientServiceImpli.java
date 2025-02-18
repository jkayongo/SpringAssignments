package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.dao.PatientDao;
import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;
@Service
public class PatientServiceImpli implements PatientService {
	
	@Autowired
	private PatientDao patientDao;
	@Transactional
	public void savePatient(Patient patient) {
		patientDao.savePatient(patient);
	}
	@Transactional
	public List<Patient> getAllPatients(){
		return patientDao.getAllPatients();
	}
	@Transactional
	public Patient getPatientById(int id) {
		return patientDao.getPatientById(id);
	}
	@Transactional
	public void deletePatient(int id) {
		patientDao.deletePatient(id);
	}
	@Transactional
	public void updatePatient(Patient patient) {
		patientDao.updatePatient(patient);
	}
}
