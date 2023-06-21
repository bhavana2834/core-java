package com.xworkz.mavenspring.glass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Tester {

	
	public static void main(String arg[]) {
		
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Glass glass=application.getBean("glass",Glass.class);
		System.out.println(glass);
		
		Glass glass1=application.getBean("glass1",Glass.class);
		System.out.println(glass1);
		
		Glass glass2=application.getBean("glass2",Glass.class);
		System.out.println(glass2);
		
		Glass glass3=application.getBean("glass3",Glass.class);
		System.out.println(glass3);
		
		Glass glass4=application.getBean("glass4",Glass.class);
		System.out.println(glass4);
		
	
		
		}
	}
	
	

