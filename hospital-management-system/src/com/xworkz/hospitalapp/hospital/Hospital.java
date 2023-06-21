package com.xworkz.hospitalapp.hospital;


import com.xworkz.hospitalapp.patient.Patient;

public class Hospital extends Object {
	
	public Patient patient[];
	int index ;

	
	public Hospital() {
			
	}
	
	public Hospital(int size){
	System.out.println("Hospital object is created");
	patient = new Patient[size];
	}
	
	public boolean admit(Patient patient){
	
	System.out.println("Admit process started");
	boolean isAdmitted = false;
	
	//validation
	
	if(patient.getPatientName()!= null && patient.getPatientName()!=""){
		this.patient[index++] = patient;
		System.out.println("patient added succesfully");
		isAdmitted = true;
	}
	
	System.out.println("Admit process ended");
	return isAdmitted;
	}
	
	//get is a read operation
	public  void getAllPatients(){
		System.out.println("list of patient detail are");
		for(int ind =0; ind<this.patient.length; ind++){
			
			System.out.println(patient[ind].getPatientId() + " " +patient[ind].getPatientName() + " " + patient[ind].getBloodGroup() + " " + patient[ind].getAge() + " " + patient[ind].getGender());
			
		}
	}
		public Patient getPatientByPatientId(int patientId) {
			System.out.println("inside getpatientBypatientId method ");
			for(int in=0;in<patient.length;in++) {
				
				if(patient[in].getPatientId()==patientId) {
					System.out.println("patient Id is matching...proceed the data");
		
					System.out.println(patient[in].getPatientId() + " " +patient[in].getPatientName() + " " + patient[in].getBloodGroup() + " " + patient[in].getAge() + " " + patient[in].getGender());
					return patient[in];
	          }
				System.out.println("end of getPatientByPatientId ");
				}
			return null;
			}
		
		public boolean updatePatientNameByPatientId(String newName, int  patientId) {
			boolean isNameUpdated = false;
			System.out.println("updateterminalNameBygate is started");
			for(int i=0;i<patient.length;i++) {
				if(patient[i].getPatientId() == patientId) {
					System.out.println("the current name is "+patient[i].getPatientName());
					patient[i].setPatientName(newName);
					System.out.println("the updated name is "+patient[i].getPatientName());
					
				}
			}
			return isNameUpdated;
			
		}
		
		
		
		
		
	
}
