package com.xworkz.factorial;

import java.util.Scanner;

public class CombinationTester {
        public static void main(String a[]) {
		Scanner scanner=new Scanner(System.in);
		Combination com= new Combination();
		
		 System.out.println("enter the value of factorial n");
         int n=scanner.nextInt();
         System.out.println("Enter the r value");
         
         int r = scanner.nextInt();
         
         if(n>=r) {
        	 
        	int comb  =  com.fact(n)/(com.fact(n-r)*com.fact(r));
        	 System.out.println("the value of "  +n+ "c"+r+"is:" +comb);
        	
        	 
         }
         
         else {
        	 
        	 System.out.println("enter the n value greater than r");
         }
       }
    

}
