package com.xworkz.switchApp.switchlight;

public class Ac implements SwitchLight {

	@Override
	public boolean onOrOff() {
		System.out.println("check whether ac is on or off");
		return true;
	}

}
