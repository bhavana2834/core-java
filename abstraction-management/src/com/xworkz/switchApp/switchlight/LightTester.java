package com.xworkz.switchApp.switchlight;

public class LightTester {
        
	public static void main(String arg[]) {
        	
        	SwitchLight light=new Ac();
        	SwitchLight light1=new WashingMachine();
        	SwitchLight light2=new Projector();
        	
        	
        	System.out.println(light.onOrOff());
        	System.out.println(light2.onOrOff());
        	System.out.println(light1.onOrOff());
        	
        	
        }
}
