package com.xworkz.switchApp.switchlight;

public class Screen implements SwitchLight{

	@Override
	public boolean onOrOff() {
		System.out.println("check whether screen is on or off");
	     
		return false;
	}
         
}
