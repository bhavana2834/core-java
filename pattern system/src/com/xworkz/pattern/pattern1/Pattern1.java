package com.xworkz.pattern.pattern1;

public class Pattern1 {
	
	@Override
	protected void finalize() throws Throwable {
		
	System.out.println("calling the finalize method to clean the object from the memory");
	
	
	}
	      
	     
           public static void main(String a[]) {
        	   
        	Pattern1 pat=new Pattern1(); 
        	
        	pat=null;
        	//System.gc();
        	
        	//Pattern1 pat2=new Pattern1(); 
        	
        	
        	 //pat=pat2;  
        	 
        	 System.gc();
        	 
          int num= 3;
          int count=0;
          for(int i=1;i<=num;i++) {
        	  if(num%1 == 0) {
        		  
        		  count = count+1;
        	  }
        	  
          }
          
          System.out.println(count);
          
          
          
           } 
}
