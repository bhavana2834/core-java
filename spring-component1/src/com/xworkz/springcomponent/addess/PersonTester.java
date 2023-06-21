package com.xworkz.springcomponent.addess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springcomponent.config.SpringConfig;
import com.xworkz.springcomponent.person.Person;



public class PersonTester {
	
	public static void main() {
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfig.class);
		Person person=application.getBean(Person.class);
		System.out.println(person);
		
	}
	
	
	

}
