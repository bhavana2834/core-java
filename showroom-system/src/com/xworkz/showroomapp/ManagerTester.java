package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;


public class ManagerTester {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter the size");
		
		ShowRoom showroom=new ShowRoom(size);
		
		Manager manager=new Manager();
		
		
		System.out.println("enter the manager Id");
		int managerId=sc.nextInt();
		manager.setManagerId(managerId);
		
		System.out.println("enter the manager name");
		
		String managerName=sc.next();
		manager.setManagerName(managerName);
		
		System.out.println("enter the qualification");
	    String  qualification=sc.next();
		manager.setQualification(qualification);
		
		System.out.println("enter the contact no");
	    long  contactNo=sc.nextLong();
		manager.setContactNo(contactNo);
		
		
		System.out.println("enter the gender");
	    String gender=sc.next();
		manager.setGender(gender);
		
		
		
	System.out.println(manager.getManagerId() + " " +manager.getManagerName() + " " + manager.getQualification()+ " " + manager.getGender() + " " + manager.getContactNo() );
	 System.out.println("Enter 1 to fetch all the manager details");
     System.out.println("Enter 2 to fetch manager id");
     System.out.println("Enter 3 to update platform name  by no of platforms");


        int option = sc.nextInt();

         switch(option) {
         case 1: showroom.getAllManager();
         break;

      case 2: System.out.println("Enter the Id to be fetched");

       int id = sc.nextInt();
       showroom.getManagerBymanagerId(id);
       break;

        case 3: System.out.println("Enter the updated name");
        int updateId= sc.nextInt();
        System.out.println("Enter the no of platforms");
        String managerName1= sc.next();
        showroom.updateManagerIdByUpdateManagerName(updateId, managerName1);
        break;
         }
        sc.close();
	
	
	}
	
}
