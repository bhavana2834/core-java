package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital{
			
	//public int pat=60;
				boolean isApllicationFormFilled = true;
				
				public ApolloHospital(int size) {
					patient = new Patient[size];
					System.out.println("the ");
				}
				/*@Override
				public boolean admit(Patient patient) {
					if(isApllicationFormFilled==true) {
						System.out.println("the patient form is filled");
					    boolean isAdmitted=super.admit(patient);
					    return isAdmitted;                       
					}
					return false;
				}
	//we need to call super method in the constructor only and it should be return first statement in the constructor.
	          
	//invoke parent members to child claass
	         /*public ApolloHospital(int size) {
	        	super(size);
	        	  System.out.println("ApolloHospital object iscreated");
	        	  
	          }
				public void display() {
					System.out.println(pat);
				}	*/	
				
				public String canteen() {
					System.out.println("canteen method");
					return "Delicious food";
				}
}
