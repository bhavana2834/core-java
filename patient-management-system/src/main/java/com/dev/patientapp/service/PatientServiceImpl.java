package com.dev.patientapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.patientapp.dto.PatientDTO;
import com.dev.patientapp.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository repo;
	
	
	
	@Override
	public PatientDTO validateAndSave(PatientDTO dto) {
		System.out.println("validate and save method started");
		
		boolean isPatientName =false;
		boolean isAge=false;
		boolean isBloodGroup=false;
		boolean isEmail=false;
		
		
		 
		if(dto.getPatientName() != null && !dto.getPatientName().isEmpty()) {
			
			isPatientName =true;
		}
		
		if(dto.getAge() != null && !dto.getAge().isEmpty()) {
			isAge=true;	
		}
		
		if(dto.getBloodGroup()!= null && !dto.getBloodGroup().isEmpty()) {
			isBloodGroup=true;			
     	}
		if(dto.getEmail()!= null && !dto.getEmail().isEmpty()) {
			
			isEmail=false;
		}
		
		 if(isPatientName==true && isAge==true && isBloodGroup==true && isEmail==true) {
			 
			 repo.save(dto);
		 }
		
		return dto;
	}


	@Override
	public List<PatientDTO> validateAndGet() {
		System.out.println("validate and get method in service");
		List<PatientDTO> list=repo.getPatient();
		
		return list;
		
	}


	@Override
	public List<PatientDTO> getByPatientName(String patientName) {
		System.out.println("get patient nameby  method in service");
		List<PatientDTO> list=repo.getPatientName(patientName);
		
		return list;
		
			}


	@Override
	public PatientDTO getPatientId(int id) {
		System.out.println(" get patient by id method in service");
		if(id>0) {
			return repo.getPatientById(id);
		}
		return null;
	}


	@Override
	public void updateById(PatientDTO dto) {
		System.out.println("update by id method in service");
     if(dto.getId()!=0 && dto.getPatientName()!=null && dto.getAge()!=null && dto.getBloodGroup()!=null && dto.getEmail()!=null) {
			
			repo.updateById(dto);
		}
		
		
	}


	@Override
	public PatientDTO DeletePatientId(int id) {
		System.out.println("delete patient id method in service");
		if(id>0) {
			return repo.DeletePatientById(id);
		}
		return null;
		
		
		
	}


	
	
	
	

}
