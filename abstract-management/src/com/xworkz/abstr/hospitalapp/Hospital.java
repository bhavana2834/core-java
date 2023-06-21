package com.xworkz.abstr.hospitalapp;

import com.xworkz.abstr.exception.EmailNotFoundException;
import com.xworkz.abstr.exception.IdNotFoundException;
import com.xworkz.abstr.exception.PatientNotFoundException;
import com.xworkz.abstr.patientapp.Patient;

public interface Hospital {
	
	  public boolean admit(Patient patient);
	  
	  
	  public void getAllPatients();
	  
	  public Patient getPatientByPatientId(int patientId) throws IdNotFoundException ;
	  
	  public Patient getPatientByPatientName(String patientName);
	  
	  public Patient getPatientByGender(String gender) throws PatientNotFoundException;
	  
	  public Patient getPatientByBloodGroup(String bloodGroup) throws PatientNotFoundException;
	  
	  public Patient getPatientByAge(int age);
	  
	  public boolean updatePatientAgeByPatientId(int newAge,int patientId);
	  
	  
	  public boolean updatePatientNameByGender(String newName,String gender);
	  
	  public boolean updatePatientAgeByPatientName(int newAge, String  patientName);


	  public  Patient  getPatientByEmail(String email) throws EmailNotFoundException ;
	  
	 
	    
	  
	  
	  
	  
	  
	  
	
	
	
	
	
                
}
