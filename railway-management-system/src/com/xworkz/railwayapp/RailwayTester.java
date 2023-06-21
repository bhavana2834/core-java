package com.xworkz.railwayapp;

import java.util.Scanner;

import com.xworkz.railwayapp.platform.Platform;
import com.xworkz.railwayapp.railway.Railway;


public class RailwayTester {
		
public static void main(String rail[]){
		
	
		/*Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter the size");
		Railway railway=new Railway(size);
		Platform platform=new Platform();
		
		System.out.println("enter the platformId");
		int platformId=sc.nextInt();
		platform.setPlatformId(platformId);
		
		System.out.println("enter the platform name");
		String platformName=sc.next();
		platform.setPlatformName(platformName);
		
		System.out.println("enter the noOfPlatforms");
		String noOfPlatform=sc.next();
		platform.setNoOfPlatform(noOfPlatform);
		
		
		System.out.println(platform.getPlatformId() + " " + platform.getPlatformName() + " " +platform.getNoOfPlatform() );
	
        System.out.println("Enter 1 to fetch all the platforms");
      System.out.println("Enter 2 to fetch platform id");
      System.out.println("Enter 3 to update platform name  by no of platforms");


         int option = sc.nextInt();

          switch(option) {
       case 1: railway.getPlatform();
       break;

       case 2: System.out.println("Enter the Id to be fetched");

        int id = sc.nextInt();
       railway.getPlatformByPlatformId(id);
        break;

         case 3: System.out.println("Enter the updated name");
         String  updateName = sc.next();
         System.out.println("Enter the no of platforms");
         String platforms = sc.next();
         railway.updatePlatformNameByNoOfPlatform(updateName, platforms);
         break;
          }
         sc.close();
          }*/
		
		

		
		Scanner scanner=new Scanner(System.in);
		
		int size=scanner.nextInt();
		Railway railway=new Railway(size);
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the platform Id");
			int platformId=scanner.nextInt();
			System.out.println("Enter the platform Name");
			String platformName=scanner.next();
			System.out.println("Enter the no of  platform  ");
			String noOfPlatform=scanner.next();
			
			
			
			Platform platform=new Platform(platformId,platformName,noOfPlatform);
			railway.enter(platform);	
		}
		
		railway.getPlatform();
		
		System.out.println("getPlatformByPlatformId is procced....");
		railway.getPlatformByPlatformId(2);
		
		System.out.println("getPlatformByPlatfromName is proceed...");
		railway.getPlatformByPlatfromName("manik");
		
		System.out.println(" getPlatformByNoOfPlatform is proceed...");
		railway.getPlatformByNoOfPlatform("O+");
		
		
		System.out.println("updating the platform info");
		railway.updatePlatformNameByNoOfPlatform("njb","hgh");
		
		
		railway.getPlatform();
		
		System.out.println("main method ended");
		scanner.close();
	}
}
	/*public void display() {
		System.out.println("");
		
	}*/
		



