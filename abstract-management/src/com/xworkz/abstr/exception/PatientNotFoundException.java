package com.xworkz.abstr.exception;

public class PatientNotFoundException extends Exception {
               
	  String errorMessage;
	  
	  public PatientNotFoundException(String errorMessage) {
		super(errorMessage);
		   
	  }
	
	
	
	
}
