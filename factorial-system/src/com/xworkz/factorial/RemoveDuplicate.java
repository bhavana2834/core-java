package com.xworkz.factorial;

public class RemoveDuplicate {
	
      public static void main(String arg[]) {
    	  
    	  int a[]={6,8,3,8,3,2};
    	  
    	 System.out.println("enter the elements :");
    	  
    	  for(int i=0;i<a.length;i++) {
    		  
    		 for(int j=i+1;j<a.length;j++) {
    			 
    			 if(a[i]==a[j]) {
    				 a[j]=-1;
    			 }	 
    		 }
    	  }
    	  for(int i=0;i<=a.length;i++) {
    		  if(a[i]!=-1){
    			  System.out.println(a[i]);
    		  } 
		  }
    }
}

