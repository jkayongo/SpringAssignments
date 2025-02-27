package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;

@Repository
public class PatientDaoImpli implements PatientDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void savePatient(Patient patient) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(patient);
	}
	public List<Patient> getAllPatients(){
		Session session = sessionFactory.getCurrentSession();
		List<Patient> patients = session.createQuery("FROM Patient", Patient.class).getResultList();
		return patients;
	}
	public Patient getPatientById(int id) {
		//the id is used as the primary key to fetch a Patient record from the database.

		Session session = sessionFactory.getCurrentSession();
		Patient patient = (Patient) session.get(Patient.class, new Integer(id));
		return patient;
	}
	public void deletePatient(int id) {
		Session session = sessionFactory.getCurrentSession();
		Patient patientToDelete = (Patient) session.get(Patient.class, new Integer(id));
		if(patientToDelete != null) {
			session.delete(patientToDelete);
		}else {
			System.out.println("Patient does not exist");
		}
		
	}
	public void updatePatient(Patient patient) {
		Session session = sessionFactory.getCurrentSession();
		session.update(patient);
	}
}
