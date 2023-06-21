package com.xworkz.mavenspring.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.xworkz.mavenspring.train.Train;

public class Tester {

public static void main(String arg[]) {
		
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Wire wire=application.getBean("wire",Wire.class);
		System.out.println(wire);
		
		Wire wire1=application.getBean("wire1",Wire.class);
		System.out.println(wire1);
		
		Wire wire2=application.getBean("wire2",Wire.class);
		System.out.println(wire2);
		
		Wire wire3=application.getBean("wire3",Wire.class);
		System.out.println(wire3);
		
		Wire wire4=application.getBean("wire4",Wire.class);
		System.out.println(wire4);
		
		}
	
	
	
	
	
	
}
