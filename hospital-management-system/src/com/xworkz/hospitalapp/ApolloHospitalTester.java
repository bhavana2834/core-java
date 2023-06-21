package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.ApolloHospital;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;



public class ApolloHospitalTester {

	public static void main(String arg[]) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		Hospital hospital=new ApolloHospital(size);
		
		ApolloHospital apolloHospitals = (ApolloHospital) hospital;
		//apolloHospitals.canteen();
		//apolloHospitals.canteen();
		
		for(int i=0;i<size;i++) {
			
			Patient patient=new Patient();
			
			System.out.println("enter the patient id");
			int patientId=sc.nextInt();
			patient.setPatientId(sc.nextInt());
			System.out.println("enter the patient name");
			String patientName=sc.next();
			patient.setPatientName(sc.next());
			System.out.println("enter the patient bloodgroup");
			String bloodGroup=sc.next();
			patient.setBloodGroup(sc.next());
			System.out.println("enter the patient age");
			int age=sc.nextInt();
			patient.setAge(sc.nextInt());
			System.out.println("enter the patient name");
			String gender=sc.next();
			patient.setGender(sc.next());
			//System.out.println(patient.getPatientId() + " " +patient.getPatientName() + " " + patient.getBloodGroup() + " " + patient.getAge() + " " + patient.getGender());
			
			hospital.admit(patient);
		}
		//apolloHospitals.canteen();
		hospital.getPatients();
		System.out.println("main method ended");
		sc.close();	
		
		/*hospital.display();
		System.out.println("pat no");*/
	}	
}
