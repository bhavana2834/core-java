package com.xworkz.abstr.hospitalapp;

import com.xworkz.abstr.exception.EmailNotFoundException;
import com.xworkz.abstr.exception.IdNotFoundException;
import com.xworkz.abstr.exception.PatientNotFoundException;
import com.xworkz.abstr.patientapp.Patient;

public class ApolloHospitalImpl implements Hospital {
	    
	
	   public Patient patient[];
	  int index;
	  
	
	   public ApolloHospitalImpl() {   
	   }
	
	   
	   public ApolloHospitalImpl(int size) {
		   
		   System.out.println("Hospital object is created");
		   patient = new Patient[size];  
	   }


	@Override
	public boolean admit(Patient patient) {
		System.out.println("Admit process started");
		
		boolean isAdmitted = false;
		if(patient.getPatientName()!= null && patient.getPatientName()!="") {
			this.patient[index++]=patient;
			System.out.println("patient added sucessfully");
			isAdmitted=true;	
		}
		System.out.println("Admit process ended");
		return isAdmitted;
		
	}


	@Override
	public void getAllPatients() {
		/*System.out.println("list of patient details are");
		for(int ind=0;ind<this.patient.length;ind++) {
			System.out.println(patient[ind]);
		}*/
		
		for(Patient pat2: patient ) {
			
			System.out.println(pat2);
		}
		
	}


	@Override
	public Patient getPatientByPatientId(int patientId) throws IdNotFoundException {
		System.out.println("inside getpatientBypatientId method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getPatientId()==patientId) {
				System.out.println("patient Id is matching...proceed the data");
	
				//System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
				System.out.println(patient[in]);
				
				return patient[in];
          }else {
        	  throw new  IdNotFoundException();
          }
			
			}
		System.out.println("end of getPatientByPatientId ");
		return null;
	}


	@Override
	public Patient getPatientByPatientName(String patientName) {
		System.out.println("inside getpatientBypatientName method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getPatientName().equals(patientName)) {
				System.out.println("patient name  is matching...proceed the data");
	
				//System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
				System.out.println(patient[in]);
				return patient[in];
          }
			System.out.println("end of getPatientByPatientName ");
			}
		
		return null;
	}


	@Override
	public Patient getPatientByGender(String gender) throws PatientNotFoundException {
		System.out.println("inside getpatientBypatientgender method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getGender().equals(gender)) {
				System.out.println("patient gender is matching...proceed the data");
	
				//System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
				System.out.println(patient[in]);
				return patient[in];
          }else {
        	  
        	  throw new PatientNotFoundException("the patient gender not found");
          }
			
			}
		System.out.println("end of getPatientByPatientId ");
		return null;
	}


	@Override
	public Patient getPatientByBloodGroup(String bloodGroup) throws PatientNotFoundException {
		System.out.println("inside getpatient Bypatient Bloodgrooup method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getBloodGroup().equals(bloodGroup)) {
				System.out.println("patient bloodgroup is matching...proceed the data");
	
				//System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
				System.out.println(patient[in]);
				return patient[in];
          }else {
        	  
        	  throw new PatientNotFoundException("the patient blood group is not found");
          }
			
			}
		System.out.println("end of getPatientByPatientbloodgroup ");
		return null;
	}


	@Override
	public Patient getPatientByAge(int age) {
		System.out.println("inside getpatientBypatientId method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getAge()==age) {
				System.out.println("patient Id is matching...proceed the data");
	
				//System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
				System.out.println(patient[in]);
				return patient[in];
          }
			System.out.println("end of getPatientByPatient ");
			}
		
		return null;
	}


	@Override
	public boolean updatePatientAgeByPatientId(int newAge, int patientId) {
		boolean isAgeUpdated=false;
		for(int i=0;i<patient.length;i++) {
			if(patient[i].getPatientId()==patientId) {
				System.out.println("the current age is "+patient[i].getAge());
				patient[i].setAge(newAge);
				System.out.println("the updated age is"+patient[i].getAge());
					
			}
			
		}
		return isAgeUpdated;
	}


	@Override
	public boolean updatePatientNameByGender(String newName, String  gender) {
		boolean isNameUpdated=false;
		System.out.println("updatedpatientname by gender");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].getGender().equals(gender)) {
				System.out.println("the current age is "+patient[i].getPatientName());
				patient[i].setPatientName(newName);
				System.out.println("the updated age is"+patient[i].getPatientName());
					
			}
			
		}
		return isNameUpdated;	
	}


	@Override
	public boolean updatePatientAgeByPatientName(int newAge, String patientName) {
		boolean isAgeUpdated=false;
		System.out.println("updatedpatientname by gender");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].getPatientName().equals(patientName)) {
				System.out.println("the current age is "+patient[i].getAge());
				patient[i].setAge(newAge);
				System.out.println("the updated age is"+patient[i].getAge());
					
			}
			
		}
		return isAgeUpdated;	
	}


	@Override
	public Patient getPatientByEmail(String email) throws EmailNotFoundException {
		
		System.out.println("inside get patient By patient email method ");
		for(int in=0;in<patient.length;in++) {
			
			if(patient[in].getEmail().equals(email)) {
				System.out.println("patient email is matching...proceed the data");
	
				
				System.out.println(patient[in]);
				return patient[in];
				
          }else {
        	  
        	  throw new EmailNotFoundException();
        	  
             }
			
			}
		System.out.println("end of getPatientByPatient email method");
		return null;
	}
	   
	   
	   
	   
	   
	
	
	
      
}
