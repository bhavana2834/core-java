package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;

public class ShowRoomTester {
		public static void main(String a[]) {
			System.out.println("main method started");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size");
			int size=scanner.nextInt();
			ShowRoom room=new ShowRoom(size);
			
			
			for(int i=0;i<size;i++) {
				Manager manager=new Manager();
				
				System.out.println("enter the manager Id");
				int managerId=scanner.nextInt();
				System.out.println("enter the manager Name");
				String managerName=scanner.next();
				System.out.println("enter the manager qualification");
				String qualification=scanner.next();
				System.out.println("enter the manager contact No");
				long contactNo=scanner.nextLong();
				System.out.println("enter the gender");
				String gender=scanner.next();
				
				
				Manager manager=new Manager(managerId,managerName,qualification,contactNo,gender);
				room.saveManager(manager);
			}
			
		
		room.getAllManager();
		
		
		room.getManagerByQualification("MBA");
		
		room.getManagerBymanagerId(2);
		room.getManagerBygender("male");
		room.getManagerBymanagerName("manik");
		room.getManagerBycontactNo(568978767);
		scanner.close();
		}
}
