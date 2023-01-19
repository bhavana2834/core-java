package com.xworkz.theatreapp;



import com.xworkz.theatreapp.theatre.Theatre;

import java.util.Scanner;


import com.xworkz.theatreapp.screens.Screens;




public class TheatreTester {
	
public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		Screens screens=new Screens();
		int size=sc.nextInt();
		Theatre theatre=new Theatre(size);
		 
		System.out.println("enter the screensId");
		int screensId=sc.nextInt();
		screens.setScreensId(screensId);
		
		System.out.println("enter the patientname");
		String screensName=sc.next();
		screens.setScreensName(screensName);
		
		System.out.println("enter the no of screens");
		int noOfScreens=sc.nextInt();
		screens.setNoOfScreens(noOfScreens);
		
		
		
		System.out.println(screens.getScreensId() + " " + screens.getScreensName() + " " +screens.getNoOfScreens() );
		
		
	
		
		
		
		
		
}	
	}
	
	

		
		
		/*System.out.println("main method started");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		Theatre theatre=new Theatre(size);
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the screens Id");
			int screensId=scanner.nextInt();
			System.out.println("Enter the screens Name");
			String screensName=scanner.next();
			System.out.println("Enter the no of screens ");
			int noOfScreens=scanner.nextInt();
			
			
			Screens screens=new Screens(screensId,screensName,noOfScreens);
			theatre.admit(screens);	
		}
		
		theatre.getScreens();
		
		System.out.println("getScreensByScreensId is procced....");
		theatre.getScreensByScreensId(2);
		
		System.out.println(" getScreensByScreensName is proceed...");
		theatre.getScreensByScreensName("manik");
		
		System.out.println("getscreensByNoOfScreens is proceed...");
		theatre.getscreensByNoOfScreens(8);
		
		
		
		System.out.println("updating the patient info");
	theatre.updateScreensIdByScreensName(81,"fgf");
		
		
		
		theatre.getScreens();
		
		System.out.println("main method ended");
		scanner.close();
	}
	
	public void display() {
		System.out.println("");
		
	}*/


