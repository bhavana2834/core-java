package com.xworkz.functionalapp;

import com.xworkz.functionalapp.functionalInterface.Addition;
import com.xworkz.functionalapp.functionalInterface.Division;
import com.xworkz.functionalapp.functionalInterface.Multiplication;
import com.xworkz.functionalapp.functionalInterface.Subtraction;

public class Tester {
	
	
	public static void main(String arg[]) {
		
		
		Addition addition=(num1,num2)->{
		System.out.println("Started add method");
		
		System.out.println(num1+num2);
		System.out.println("end  of the add method");
		};
		addition.add(20,56);
		
		
		Subtraction subtraction=(num1,num2)->{
			
		System.out.println("start of sub method");
		System.out.println(num1-num2);
		System.out.println("end of sub method");
		};
		subtraction.sub(67,23);
		

		Division division=(num1,num2)->{
			
			System.out.println("Start of div method");
		    System.out.println(num1/num2);
		    System.out.println("end of div method");
		};
		division.div(98776,23);
		

		Multiplication multiplication=(num1,num2)->
		{
			System.out.println("start of mul method");
			System.out.println(num1*num2);
			System.out.println("end of mul method");
		};
		multiplication.mul(489,595);
		
		
		
		
	}
	
	
              
}
