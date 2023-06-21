package com.xworkz.factorial;

public class DuplicateArray {
	
              public static void main(String ar[]) {
            	  
            	  int a[]= {1,3,2,1,4,5,5,7,5,4};
            	  for(int i=0;i<a.length;i++) {
            		  
            		  for(int j=i+1;j<a.length;j++) {
            			  
            			if(a[i]==a[j]) {
            				System.out.println("duplicate eleents of array:  " +  a[i]);
            			}  
            			  
            			  
            		  }
            		  
            		  
            	  }
            	  
            	  
            	  
            	  
            	  
            	  
              }
}
