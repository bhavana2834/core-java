package com.xworkz.railwayapp.railway;

import com.xworkz.railwayapp.platform.Platform;

public class Railway {
	
	
	public Platform platform[];
	int index ;
	
	public Railway() {
		
	}
	
	public Railway(int size){
	
	System.out.println("RailwayStation object is created");
	platform=new Platform[size];
	}
									
	public boolean enter(Platform platform){
	
	System.out.println("enter process started");
	boolean isEntered = false;
	if(platform.getPlatformName()!= null && platform.getPlatformName()!=""){
		
		this.platform[index++] = platform;
		System.out.println("platform entered succesfully");
		
		isEntered = true;	
	}
	
	System.out.println("enter process ended");
	return isEntered;
	}
	
	public  void getPlatform(){
		System.out.println("list of patient detail");
		for(int ind =0; ind<this.platform.length;ind++){
			
		System.out.println(platform[ind].getPlatformId() + "  " +platform[ind].getPlatformName() + "  " + platform[ind].getNoOfPlatform() );
		System.out.println("list of patient detail ended");	
		}	
	}
	public Platform getPlatformByPlatformId(int platformId) {
		System.out.println("inside getPlatformByPlatformId method ");
		for(int in=0;in<platform.length;in++) {
			if(platform[in].getPlatformId()==platformId) {
				System.out.println("platform Id is matching...proceed the data");
	
			
				System.out.println(platform[in].getPlatformId() + "  " +platform[in].getPlatformName() + "  " + platform[in].getNoOfPlatform() );
return platform[in];
}
			System.out.println("end of  getPlatformByPlatformId");
			}
		return null;
		}
	public Platform getPlatformByPlatfromName(String name) {
		System.out.println("inside getPlatformByPlatformId method ");
		for(int in=0;in<platform.length;in++) {
			if(platform[in].getPlatformName()==name) {
				System.out.println("platform Id is matching...proceed the data");
	
			
				System.out.println(platform[in].getPlatformId() + "  " +platform[in].getPlatformName() + "  " + platform[in].getNoOfPlatform() );
return platform[in];
}
			System.out.println("end of  getPlatformByPlatformName");
			}
		return null;
		}
	public Platform getPlatformByNoOfPlatform(String noOfPlatform) {
		System.out.println("inside getPlatformByPlatformId method ");
		for(int in=0;in<platform.length;in++) {
			if(platform[in].getNoOfPlatform()==noOfPlatform) {
				System.out.println("platform Id is matching...proceed the data");
	
			
				System.out.println(platform[in].getPlatformId() + "  " +platform[in].getPlatformName() + "  " + platform[in].getNoOfPlatform() );
return platform[in];
}
			System.out.println("end of  getPlatformByPlatformId");
			}
		return null;
		}
	
	
	public boolean updatePlatformNameByNoOfPlatform(String newName, String  noOfPlatform) {
		boolean isNameUpdated = false;
		System.out.println("updateterminalNameBygate is started");
		for(int i=0;i<platform.length;i++) {
			if(platform[i].getNoOfPlatform()== noOfPlatform) {
				System.out.println("the current name is "+platform[i].getPlatformName());
				platform[i].setPlatformName(newName) ;
				System.out.println("the updated name is "+platform[i].getPlatformName());
				
			}
		}
		return isNameUpdated;
		
	}
	
}
