package com.xworkz.encapsulationapp.platformapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.platformapp.platform.Platform;



public class PlatformTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
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
	}
}
