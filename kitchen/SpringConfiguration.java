package com.xworkz.mavenspring.kitchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mavenspring.glass.Glass;



@Configuration
public class SpringConfiguration {
	@Bean(name="kitchen")
	public Kitchen getKitchen() { 	

		Kitchen kitchen=new Kitchen();
		kitchen.setId(1);
		kitchen.setType("oneWall");
		kitchen.setNoOfItem(56);
	
	
	return kitchen;

}
	
	@Bean(name="kitchen1")
	public Kitchen getKitchen1() { 	

		Kitchen kitchen=new Kitchen();
		kitchen.setId(2);
		kitchen.setType("rounded");
		kitchen.setNoOfItem(23);
	
	
	return kitchen;

}
	
	@Bean(name="kitchen2")
	public Kitchen getKitchen2() { 	

		Kitchen kitchen=new Kitchen();
		kitchen.setId(3);
		kitchen.setType("circle");
		kitchen.setNoOfItem(76);
	
	
	return kitchen;

}
	@Bean(name="kitchen3")
	public Kitchen getKitchen3() { 	

		Kitchen kitchen=new Kitchen();
		kitchen.setId(4);
		kitchen.setType("spherical");
		kitchen.setNoOfItem(87);
	
	
	return kitchen;

}
	@Bean(name="kitchen4")
	public Kitchen getKitchen4() { 	

		Kitchen kitchen=new Kitchen();
		kitchen.setId(5);
		kitchen.setType("spherical-rounded");
		kitchen.setNoOfItem(76);
	
	
	return kitchen;

}

}
