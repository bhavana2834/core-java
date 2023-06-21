package com.xworkz.abstr;

import java.util.Scanner;

import com.xworkz.abstr.exception.EmailNotFoundException;
import com.xworkz.abstr.exception.IdNotFoundException;
import com.xworkz.abstr.exception.PatientNotFoundException;
import com.xworkz.abstr.hospitalapp.ApolloHospitalImpl;
import com.xworkz.abstr.hospitalapp.Hospital;
import com.xworkz.abstr.patientapp.Patient;

public class ApolloHospitalTester {
          public static void main(String a[]) {
        	  
        	  System.out.println("main method started");
        	  
        	  Scanner sc = new Scanner(System.in);
        	  System.out.println("Enter the size");
        	  int size=sc.nextInt();
        	  
        	  Hospital hospital = new ApolloHospitalImpl(size);
        	  
        	  for(int i=0;i<size;i++) {
        		  
        		  Patient patient = new Patient();
        		  System.out.println("enter the patient id");
        		  patient.setPatientId(sc.nextInt());
        		  System.out.println("enter the patient Name");
        		  patient.setPatientName(sc.next());
        		  System.out.println("enter the blood Group");
        		  patient.setBloodGroup(sc.next());
        		  System.out.println("enter the age");
        		  patient.setAge(sc.nextInt());
        		  System.out.println("enter the gender");
        		  patient.setGender(sc.next());
        		  System.out.println("enter the email");
        		  patient.setEmail(sc.next());
        		  
        		  hospital.admit(patient);  
        	  }
        	  hospital.getAllPatients();
        	  
        	  try {
			
            hospital.getPatientByGender("male");
			
			} catch (PatientNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  
        	  try {
				hospital.getPatientByBloodGroup("ab");
			} catch (PatientNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  
        	  
        	 /* try {
				hospital.getPatientByPatientId(1);
			} catch (IdNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	  
        	  try {
					hospital.getPatientByEmail("bhavana@gmail.com");
				} catch (EmailNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}*/
        	  System.out.println("Main method ended");
        	  sc.close();	  
          }
}
