package com.xworkz.switchApp.switchlight;

public class WashingMachine implements SwitchLight {

	@Override
	public boolean onOrOff() {
	  System.out.println("check whether the washing machine is on or off");
		return true;
	}

}
