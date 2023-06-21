package com.xworkz.mavenspring.person1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mavenspring.glass.Glass;



public class Tester {
	
	
	public static void main(String arg[]) {
	
		
	ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Person person=application.getBean("person1",Person.class);
	System.out.println(person);
	
	Person person1=application.getBean("person",Person.class);
	System.out.println(person1);
	
	
	Person person2=application.getBean("person2",Person.class);
	System.out.println(person2);
	
	Person person3=application.getBean("person3",Person.class);
	System.out.println(person3);
	
	Person person4=application.getBean("person4",Person.class);
	System.out.println(person4);
	
	
	/*Glass glass=application.getBean(Glass.class);
	System.out.println(glass);
	
	   String str=application.getBean(String.class);
	   System.out.println(str);
	   
	   Integer integer=application.getBean(Integer.class);
	   System.out.println(integer);
	   
	   Boolean boolean=application.getBean(Boolean.class);
	   System.out.	   
	   
	   Character character = application.getBean(Character.class);
	   System.out.println(character);
	   
	   Byte byte1 = application.getBean(Byte.class);
	   System.out.println(byte1);
	   
	   Short short1=application.getBean(Short.class);
	   System.out.println(short1);
	   
	   Double double1=application.getBean(Double.class);
	   System.out.println(double1);
	   
	   Long long1=application.getBean(Long.class);
	   System.out.println(long1); 
	   
	   Float float1=application.getBean(Float.class);
	   System.out.println(float1);
	   
	   Scanner sc=application.getBean(Scanner.class);
	   System.out.println(sc);
	   
	   
	   
	}*/
	}
}
