package com.xworkz.springcomponent.addess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springcomponent.config.SpringConfig1;
import com.xworkz.springcomponent.person.Person;

public class Tester {
	
	
	
public static void main() {
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfig1.class);
		
		
	}

}
