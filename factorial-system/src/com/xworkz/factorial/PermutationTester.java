package com.xworkz.factorial;

import java.util.Scanner;

public class PermutationTester {
                   public static void main(String a[]) {
					Scanner scanner=new Scanner(System.in);
					Permutation per = new Permutation();
					
					 System.out.println("enter the value of factorial n");
	                 int n=scanner.nextInt();
	                 System.out.println("Enter the r value");
	                 
	                 int r = scanner.nextInt();
	                 if(n>=r) {
	                	 int permu = per.fact(n)/per.fact(n-r);
	                	 System.out.println("the value of "  +n+ "p"+r+"is:"+permu);
	                	 
	                 }
	                 else {
	                	 System.out.println("enter the n value greater than r");
	                 }
                   }
               
}
