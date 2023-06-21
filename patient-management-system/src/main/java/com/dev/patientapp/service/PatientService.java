package com.dev.patientapp.service;

import java.util.List;

import com.dev.patientapp.dto.PatientDTO;

public interface PatientService {
	
	
	public PatientDTO validateAndSave(PatientDTO dto);

	public List<PatientDTO> validateAndGet();

	public List<PatientDTO> getByPatientName(String patientName);

	public PatientDTO getPatientId(int id);

	public void updateById(PatientDTO dto);

	

	public PatientDTO DeletePatientId(int id);
	
	
	

}
