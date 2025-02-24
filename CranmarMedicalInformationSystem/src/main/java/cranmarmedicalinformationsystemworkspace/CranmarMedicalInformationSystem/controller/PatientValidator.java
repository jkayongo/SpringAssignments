package cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.controller;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cranmarmedicalinformationsystemworkspace.CranmarMedicalInformationSystem.model.Patient;

@Component
public class PatientValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Patient.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Patient patient = (Patient)target;
		if(patient.getPatientName() == "") {
			errors.reject("Name must not be blank");
		}
		if(patient.getPatientAge() < 0 || patient.getPatientAge() > 125) {
			errors.reject("Age must be between 0 and 125");
		}
		if(patient.getDiagonosis() == "") {
			errors.reject("Diagonosis is required");
		}
		if(patient.getResidence() == "") {
			errors.reject("Residence is required");
		}
		
		
		
	}
	
	
}
