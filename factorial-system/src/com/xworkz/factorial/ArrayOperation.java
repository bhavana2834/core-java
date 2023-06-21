package com.xworkz.factorial;

public class ArrayOperation {
         
	    public static void main(String arg[]) {
        	/*int a[]= {23,45,87,96,54,87,76};
              int count=0;
        	System.out.println(a.length);   //length of array
        	 for(int i=0;i<a.length;i++) {
        		
        		 if(a[i]%2==0) {   // for number matched or not just initialize a[i]==67
        			 //System.out.println("number:" + i + ":"+ a[i]);
        			 System.out.println("even");
        			 count++;
        		 }
        		 else {
        			 System.out.println("odd");
        		 
        		 }
        	 }*/
	    	
        	 int a[]= {2,3,12,56,67,89,10};
        	
	         for(int i=0;i<a.length;i++) {
	        	int count=0;
	        	for(int j=1;j<=a[i];j++ ) {
	        		if(a[i]%j==0) {
	        			count++;
	        			
	        		}
	        		
	        	}
	        	if(count==2) {
	        	System.out.println("it is a prime number");
	        	}else {
	        		System.out.println("it is not prime number");
	        		
	        	}
	        	 
	         }
	         
        		
        		
       
         }
}
