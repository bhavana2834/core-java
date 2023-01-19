package com.xworkz.encapsulationapp.patientapp;



import java.util.Scanner;

import com.xworkz.encapsulationapp.patientapp.patient.Patient;

public class PatientTester {
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			Patient patient=new Patient();
			System.out.println("enter the patientId");
			int patientId=sc.nextInt();
			patient.setPatientId(patientId);
			
			System.out.println("enter the patientname");
			String patientName=sc.next();
			patient.setPatientName(patientName);
			
			System.out.println("enter the bloodGroup");
			String bloodGroup=sc.next();
			patient.setBloodGroup(bloodGroup);
			
			System.out.println("enter the age");
			int age=sc.nextInt();
			patient.setAge(age);
			
			System.out.println("enter the gender");
			String gender=sc.next();
			patient.setGender(gender);
			
			System.out.println(patient.getPatientId() + " " + patient.getPatientName() + " " + patient.getBloodGroup() + "" + patient.getAge()+ " "+ patient.getGender());
		}
}
