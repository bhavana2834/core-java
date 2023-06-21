package com.xworkz.spring_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_qualifier.owner.Owner;

import com.xworkz.spring_qualifier.springConfig.SpringConfig;




public class Tester {
	
	
	public static void main(String arg[]) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Owner owner=context.getBean(Owner.class);
		
		owner.getRestuarant().serveFood();
		
	}
	

}
