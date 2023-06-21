package com.xworkz.encapsulationapp.screensapp.screens;

public class Screens {
	private int screensId;
	private String screensName;
	private int  noOfScreens;
	
	public void setScreensId(int screensId) {
		this.screensId=screensId;	
	}
	public int getScreensId() {
		return screensId;
	}
	public void setScreensName(String screensName) {
		this.screensName=screensName;	
	}
	public String getScreensName() {
		return "screensId";
	}
	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens=noOfScreens;	
	}
	public int getNoOfScreens() {
		return noOfScreens;
	}
	
}
