package com.xworkz.hospitalapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	
	
	public static void main(String hos[]) {
		  /*BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an number:");
        int a = Integer.parseInt(bufferReader.readLine());
        System.out.printf("You entered: " + a);*/
		
		System.out.println("main method started");
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter the size");
		
		//int num =scanner.nextInt();
		//int num= Integer.parseInt(bufferReader.readLine());
		int size = Integer.parseInt(bufferReader.readLine());
		
		Hospital hospital=new Hospital(size);
		
		for(int i=0;i<size;i++) {
			//Patient patient =new Patient();
			System.out.println("Enter the patient Id");
			//patient.setPatientId(Integer.parseInt(bufferReader.readLine()));
			 int patientId=Integer.parseInt(bufferReader.readLine());
			System.out.println("Enter the patient Name");
			//patient.setPatientName(bufferReader.readLine());
			  String patientName=bufferReader.readLine();
			System.out.println("Enter the patient bloodGroup ");
			//patient.setBloodGroup(bufferReader.readLine());
			String bloodGroup=bufferReader.readLine();
			System.out.println("Enter the age ");
			//patient.setAge(Integer.parseInt(bufferReader.readLine()));
			int age=Integer.parseInt(bufferReader.readLine());
			
			System.out.println("Enter the gender");
			//patient.setGender(bufferReader.readLine());
			String gender =bufferReader.readLine();
		
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
		/*
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
		scanner.close();*/
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
			
			
		