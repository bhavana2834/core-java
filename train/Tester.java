package com.xworkz.mavenspring.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Tester {
	
	
	public static void main(String arg[]) {
		
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Train train=application.getBean("train",Train.class);
		System.out.println(train);
		
		Train train1=application.getBean("train1",Train.class);
		System.out.println(train1);
		
		Train train2=application.getBean("train2",Train.class);
		System.out.println(train2);
		
		Train train3=application.getBean("train3",Train.class);
		System.out.println(train3);
		
		Train train4=application.getBean("train4",Train.class);
		System.out.println(train4);
		
		
		
		}
	

}
