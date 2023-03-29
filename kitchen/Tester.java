package com.xworkz.mavenspring.kitchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {
	
	
public static void main(String arg[]) {
		
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Kitchen kitchen=application.getBean("kitchen",Kitchen.class);
		System.out.println(kitchen);
		
		Kitchen kitchen1=application.getBean("kitchen1",Kitchen.class);
		System.out.println(kitchen1);
		
		Kitchen kitchen2=application.getBean("kitchen2",Kitchen.class);
		System.out.println(kitchen2);
		
		
		Kitchen kitchen3=application.getBean("kitchen3",Kitchen.class);
		System.out.println(kitchen3);
		
		Kitchen kitchen4=application.getBean("kitchen4",Kitchen.class);
		System.out.println(kitchen4);
		
		}
	

}
