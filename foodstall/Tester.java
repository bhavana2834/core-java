package com.xworkz.mavenspring.foodstall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Tester {

public static void main(String arg[]) {
		
		
		ApplicationContext  application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FoodStall foodStall=(FoodStall)application.getBean("foodStall1");
		System.out.println(foodStall);
		
		FoodStall foodStall1=application.getBean("foodStall",FoodStall.class);
		System.out.println(foodStall1);
		
		FoodStall foodStall2=application.getBean("food2",FoodStall.class);
		System.out.println(foodStall2);
		
		FoodStall foodStall3=application.getBean("food3",FoodStall.class);
		System.out.println(foodStall3);
		
		FoodStall foodStall4=application.getBean("food4",FoodStall.class);
		System.out.println(foodStall4);
		
		

	    String str=application.getBean("string",String.class);
		 System.out.println(str);
		
		 String str1=application.getBean("string1",String.class);
		 System.out.println(str1);
		
		 String str2=application.getBean("string2",String.class);
		 System.out.println(str2);
		 
		 String str3=application.getBean("string3",String.class);
		 System.out.println(str3);
		 
		 String str4=application.getBean("string4",String.class);
		 System.out.println(str4);
		 
		 Integer integer=application.getBean("integer",Integer.class);
		   System.out.println(integer);
		   
		   Integer integer1=application.getBean("integer1",Integer.class);
		   System.out.println(integer1);
		   
		   Integer integer2=application.getBean("integer2",Integer.class);
		   System.out.println(integer2);
		   
		   Integer integer3=application.getBean("integer3",Integer.class);
		   System.out.println(integer3);
		   
		   Integer integer4=application.getBean("integer4",Integer.class);
		   System.out.println(integer4);
		 
		   Short short1=application.getBean("short1",Short.class);
		   System.out.println(short1);
		   
		   Short short2=application.getBean("short2",Short.class);
		   System.out.println(short2);
		   
		   Short short3=application.getBean("short3",Short.class);
		   System.out.println(short3);
		   
		   Short short4=application.getBean("short4",Short.class);
		   System.out.println(short4);
		   
		   Short short5=application.getBean("short5",Short.class);
		   System.out.println(short5);
		 
		 
		 
		}
	
}
