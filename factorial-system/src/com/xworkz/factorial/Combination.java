package com.xworkz.factorial;

public class Combination {
	
	
       public int fact(int number) {
		
		int fact  = 1;
		for(int i=1;i<=number;i++) {
			
			fact  = fact*i;
		}
		return fact;
	    }

	

	
}
