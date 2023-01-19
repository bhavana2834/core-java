package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	public static void main(String hos[]){
		
		
		System.out.println("main method started");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		
		Hospital hospital=new Hospital(size);
		
		for(int i=0;i<size;i++) {
			//Patient patient =new Patient();
			System.out.println("Enter the patient Id");
			//patient.setPatientId(sc.nextInt());
			  int patientId=scanner.nextInt();
			System.out.println("Enter the patient Name");
			//patient.setPatientName(sc.next());
			  String patientName=scanner.next();
			System.out.println("Enter the patient bloodGroup ");
			//patient.setBloodGroup(sc.next());
			String bloodGroup=scanner.next();
			System.out.println("Enter the age ");
			//patient.setAge(sc.nextInt());
			int age=scanner.nextInt();
			
			System.out.println("Enter the gender");
			//patient.setGender(sc.next());
			String gender =scanner.next();
			                               /*System.out.println(patient.getPatientId()+" "+patient.getPatientName()+ " " +patient.getBloodGroup() + " " + patient.getAge() + " "+ patient.getGender() );
			                               sc.close();
			
		                                   hospital.admit(patient);
			                                hospital.getAllPatients();
			                               System.out.println("the main method ended");*/
			Patient patient = new Patient();
			patient.setAge(age);
			patient.setBloodGroup(bloodGroup);
			patient.setGender(gender);
			patient.setPatientId(patientId);
			patient.setPatientName(patientName);
			hospital.admit(patient);
			
		}
		
		int option=0;
		String answer="yes";
		do {
		System.out.println("Enter 1 to fetch all the patients");
		System.out.println("Enter 2 to fetch patient by Id");
		System.out.println("Enter 3 to update patient age by patient Name");
		System.out.println("Enter 4 to exit");
		
		option = scanner.nextInt();
		
		switch(option) {
		case 1: hospital.getAllPatients();
		break;
		
		case 2: System.out.println("Enter the Id to be fetched");
		
		         int id = scanner.nextInt();
		         hospital.getPatientByPatientId(id);
		         break;
		         
		case 3: System.out.println("Enter the updated age");
		          String  updateName = scanner.next();
		          System.out.println("Enter the patient name");
		          int patientId = scanner.nextInt();
		          hospital.updatePatientNameByPatientId(updateName, patientId);
		          break;
		
		          
		 case 4: System.out.println("thank you for visiting");
		 break;
		 }
                 
		//System.out.println("do you want to continue yes or no");
         
         
         
	       }while(answer.equals(scanner.next()));
	    System.out.println("the main method ended");
        scanner.close();
		       
		System.out.println("main method ended");
		scanner.close();
	
	}
}
			
			
		