package com.xworkz.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionFile {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("calling the finalize method to clean the object from the memory");
	}
	
	
	public static void main(String arg[]) {
   	 
		ExceptionFile file=new ExceptionFile();
		
		file=null;
		
		 System.out.println("main method started");
   	  try {
	Class cls  = Class.forName("com.xworkz.exception.ExceptionFile");
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	  
      	      File file= new File("myfile.text");
	       try {
		     file.createNewFile();
		 
	         }catch(IOException e) {
		
		 e.printStackTrace();
		 
		 
	 }
   	  
   	  
   	  System.out.println("main method ended");  
   	  
   	  
     }
	     
	 
     
	    
     
	 
	 
	 
	 
	 
	 
	 
}
