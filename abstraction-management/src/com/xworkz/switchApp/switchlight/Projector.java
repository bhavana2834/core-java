package com.xworkz.switchApp.switchlight;

public class Projector implements SwitchLight{

	@Override
	public boolean onOrOff() {
		System.out.println("check whether the project is on or off");
		return true;
	}

}
