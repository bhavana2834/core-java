package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.screens.Screens;

public class Theatre {

	static int read=866;
	
	
	Screens screens[];
	int index ;
	
	public Theatre() {
		
	}
	
	public Theatre(int size){
	
	System.out.println("Theatreobject is created");
	screens =new Screens[size];
	}
										
	
	public boolean admit(Screens screens){
	
	System.out.println("Admit process started");
	boolean isAdmitted = false;
	
	//validation
	
	if(screens.getScreensName() != null && screens.getScreensName() !=""){
		
		this.screens[index++] = screens;
		System.out.println("screens added succesfully");
		isAdmitted = true;	
	}
	System.out.println("Admit process ended");
	return isAdmitted;
	}
	
	//get is a read operation
	public  void getScreens(){
	System.out.println("list of patient detail");
	for(int ind =0; ind<this.screens.length; ind++){
	System.out.println(screens[ind].getScreensId() + " " +screens[ind].getScreensName() + " " +screens[ind]. getNoOfScreens() );
		}
		
		
	}
	public Screens getScreensByScreensId(int screensId) {
		System.out.println("inside getScreensByScreensId method");
		for(int in=0;in<screens.length;in++) {
			if(screens[in].getScreensId()==screensId) {
				System.out.println("screens id matching.....proceed with data");
				System.out.println(screens[in].getScreensId() + " " +screens[in].getScreensName() + " " +screens[in]. getNoOfScreens() );	
				return  screens[in];
			}
		}
		return  null;
	}
	public Screens getScreensByScreensName(String screensName) {
		System.out.println("inside getPatientByPatientId method");
		for(int in=0;in<screens.length;in++) {
			if(screens[in].getScreensName()==screensName) {
				System.out.println("screens  id matching.....proceed with data");
				System.out.println(screens[in].getScreensId() + " " +screens[in].getScreensName() + " " +screens[in]. getNoOfScreens() );
				return  screens[in];
			}
		}
		return  null;
	}
	
	public Screens getscreensByNoOfScreens(int  noOfScreens) {
		System.out.println("inside getscreensByNoOfScreens method");
		for(int in=0;in<screens.length;in++) {
			if(screens[in].getNoOfScreens()==noOfScreens) {
				System.out.println("screens id matching.....proceed with data");
				System.out.println(screens[in].getScreensId() + " " +screens[in].getScreensName() + " " +screens[in]. getNoOfScreens() );
				return  screens[in];
			}
		}
		return  null;
	}
	
	
	
	public boolean updateScreensIdByScreensName(int newId , String screensName) {
		boolean isAgeUpdated = false;
		System.out.println("updatePatientAgeByPatientId is started");
		for(int i=0;i<screens.length;i++) {
			if(screens[i].getScreensName() == screensName) {
				System.out.println("the current age is "+screens[i].getScreensName());
				screens[i].setScreensName(screensName)  ;
				System.out.println("the updated age is "+screens[i].getScreensName());
				
			}
		}
		return isAgeUpdated;
		
	}
	
	
	
	
	
}
