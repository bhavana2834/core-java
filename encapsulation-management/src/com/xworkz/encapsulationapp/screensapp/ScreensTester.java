package com.xworkz.encapsulationapp.screensapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.screensapp.screens.Screens;

public class ScreensTester {

	
	
	
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		Screens screens=new Screens();
		 
		 
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
