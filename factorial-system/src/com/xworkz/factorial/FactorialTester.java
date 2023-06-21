package com.xworkz.factorial;

import java.util.Scanner;

public class FactorialTester {
                  
	           public static void main(String a[]) {
	        	   
	        	   
	        	   Scanner scanner =new Scanner(System.in);
	        	   
	        	   Factorial fac=new Factorial();
	        	   System.out.println("enter the value of factorial n");
	        	   int n=scanner.nextInt();
	        	   if(n>0)
	        	     {
	        	      int fact  = fac.fact(n);
	        	   System.out.println("the factorial of" + n  + " is"   + fact );
	        	     }
	           }
}
