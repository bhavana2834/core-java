package com.xworkz.mvcapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mvcapp.config.SpringConfig;
import com.xworkz.mvcapp.controller.AmusementParkController;
import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;

public class SpringMvcTester {
	
	public static void main(String arg[]) throws AmusementParkException  {
		AmusementParkDto amusementParkDto=new AmusementParkDto();
		
		
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AmusementParkController controller=context.getBean(AmusementParkController.class);
		
		System.out.println("Managed by Ac");
		AmusementParkController controller1=context.getBean(AmusementParkController.class);
		AmusementParkController controller2=context.getBean(AmusementParkController.class);
		AmusementParkController controller3=context.getBean(AmusementParkController.class);
		AmusementParkController controller4=context.getBean(AmusementParkController.class);
		
		System.out.println(controller);
		System.out.println(controller1);
		System.out.println(controller2);
		System.out.println(controller3);
		System.out.println(controller4);
		
		System.out.println("Managed by Dev");
		
		AmusementParkController park=new AmusementParkController();
		AmusementParkController park1=new AmusementParkController();
		AmusementParkController park2=new AmusementParkController();
		AmusementParkController park3=new AmusementParkController();
		AmusementParkController park4=new AmusementParkController();
		
		System.out.println(park);
		System.out.println(park1);
		System.out.println(park2);
		System.out.println(park3);
		System.out.println(park4);
		
		
		AmusementParkDto dto =context.getBean(AmusementParkDto.class);
		
		AmusementParkDto saveDto=controller.process(dto);
		
		System.out.println(saveDto);
		
		
		
		
		
	}
	
	
	

}
