package com.dev.patientapp.repository;

import java.util.List;

import com.dev.patientapp.dto.PatientDTO;

public interface PatientRepository {

	public PatientDTO save(PatientDTO dto);

	public List<PatientDTO> getPatient();

	public List<PatientDTO> getPatientName(String patientName);

	 PatientDTO getPatientById(int id);

	public void updateById(PatientDTO dto);

	public PatientDTO DeletePatientById(int id);

	
	
	

}
