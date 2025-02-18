package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;
import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.service.PatientService;

@RestController
public class PatientRestController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value= "/patients", method = RequestMethod.POST)
	public String notification(@RequestBody Patient patient) {
		patientService.savePatient(patient);
		return "Hey, " + patient.getPatientName() + " " + "you have successfully registered";
		
	}
	@RequestMapping("/checkStatus")
	public String submit(@RequestBody String name) {
		return "You have successfully transimitted patient data." + name;
	}
	@RequestMapping(value = "/getAllPatients", method = RequestMethod.GET)
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	@RequestMapping(value = "/getPatientById/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathVariable("id") int id) {
		return patientService.getPatientById(id);
	}
	@RequestMapping(value = "/deletePatient/{id}", method = RequestMethod.DELETE)
	public void deletePatient(@PathVariable("id") int id) {
		 patientService.deletePatient(id);
	}
	@RequestMapping(value = "/updatePatient/{id}", method = RequestMethod.PUT)
	public void updatePatient(@PathVariable("id") int id, @RequestBody Patient patient ) {
		Patient patientToUpdate = patientService.getPatientById(id);
		patientToUpdate.setPatientName(patient.getPatientName());
		patientToUpdate.setPatientAge(patient.getPatientAge());
		patientToUpdate.setDiagonosis(patient.getDiagonosis());
		patientToUpdate.setResidence(patient.getResidence());
		patientService.updatePatient(patientToUpdate);
		
	}
}
