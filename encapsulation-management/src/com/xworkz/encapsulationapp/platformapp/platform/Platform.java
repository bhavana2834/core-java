package com.xworkz.encapsulationapp.platformapp.platform;

public class Platform {
	private int platformId;
	private String platformName;
	private String noOfPlatform;
	
	public Platform() {
		
		
	}
	public void setPlatformId(int platformId) {
		this.platformId=platformId;
	}
	public int getPlatformId() {
		return platformId;
	}
	public void setPlatformName(String platformName) {
		this.platformName=platformName;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setNoOfPlatform(String noOfPlatform) {
		this.noOfPlatform=noOfPlatform;
	}
	public String getNoOfPlatform() {
		return noOfPlatform;
	}
}
