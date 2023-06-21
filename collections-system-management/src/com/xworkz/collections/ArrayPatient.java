package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayPatient {
	
	
              public static void main(String arg[]) {
            	  
            	  List<Patient> data=new ArrayList<Patient>();
            	  
            	  data.add(new Patient(1,"Bhavana","ab",45,"female"));
            	  data.add(new Patient(2,"darani","b",58,"female"));
            	  data.add(new Patient(3,"nidhi","a",17,"female"));
            	  data.add(new Patient(4,"vishwa","ab",45,"male"));
            	  data.add(new Patient(5,"raghu","b",45,"male"));
            	  
            	  Iterator<Patient> itr=data.iterator();
            	  
            	  while(itr.hasNext()) {
            		  
            		Patient pat=itr.next();  
            		  
            		  System.out.println(pat);
            		  
            		  
            	  }
            	  
            	  
            	  
            	  
            	  
            	  
              }
}
