package com.xworkz.abstr;

import java.util.Scanner;

import com.xworkz.abstr.exception.EmailNotFoundException;
import com.xworkz.abstr.hospitalapp.ApolloHospitalImpl;
import com.xworkz.abstr.hospitalapp.Hospital;
import com.xworkz.abstr.patientapp.Patient;

public class HospitalTester {
	
	          public static void main(String ar[]) {
                System.out.println("main method started");
                Scanner sc =new Scanner(System.in);
               
                System.out.println("enter the size");
                
                int size = sc.nextInt();
                
                
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
                	
                	//Patient patient=new Patient(patientId,patientName,bloodGroup,age,gender,email);
                }
                	
                
               // hospital.getAllPatients();
          	  
          	  try {
  					hospital.getPatientByEmail("bhavana@gmail.com");
  				} catch (EmailNotFoundException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  			}
          	  System.out.println("Main method ended");
          	  sc.close();	  
                	
                	
                	
                	
                }
                
	}             

