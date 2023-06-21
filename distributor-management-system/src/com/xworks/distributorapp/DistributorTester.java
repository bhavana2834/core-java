package com.xworks.distributorapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.xworks.distributorapp.BloodGroup.BloodGroup;
import com.xworks.distributorapp.comparator.AgeComparator;
import com.xworks.distributorapp.comparator.SalesPersonNameComparator;
import com.xworks.distributorapp.distributor.DistributorDto;
import com.xworks.distributorapp.distributor.DistributorImpl;
import com.xworks.distributorapp.distributor.SalesPersonDto;
import com.xworks.gender.Gender;
//import com.xworkz.collections.Patient;

public class DistributorTester {
          
	        public static  void main(String arg[]) {
	        	Scanner sc=null;
	        	List<SalesPersonDto>  list=new ArrayList<SalesPersonDto>();
	        	
	        try {
	        	//DistributorDto dto=new DistributorImpl();
	        	sc=new Scanner(System.in);
	        	
	        	
	        	//try {
	        		
	        		System.out.println("Enter the size");
	          	    int size=sc.nextInt();
	          	    
	          	    DistributorDto dto=new DistributorImpl();
	        		//SalesPersonDto sales=new SalesPersonDto();
	        		
	        		for(int i=0;i<2;i++) {
	        			
	        		SalesPersonDto sales=new SalesPersonDto();
	        		
	        		System.out.println("enter the salesperson id");
	        		sales.setId(sc.nextInt());
	        		System.out.println("enter the salesperson name");
	        		sales.setSalesPersonName(sc.next());
	        		System.out.println("enter the salesperson adress");
	        		sales.setAddress(sc.next());
	        		System.out.println("enter the salesperson phone number");
	        		sales.setPhoneNumber(sc.nextLong());
	        		System.out.println("enter the salesperson age");
	        		sales.setAge(sc.nextInt());
	        		System.out.println("enter the salesperson bloodGroup");
	        		sales.setBloodGroup(BloodGroup.valueOf(sc.next()));
	        		System.out.println("enter the salesperson gender");
	        		sales.setGender(Gender.valueOf(sc.next()));
	        		
	        		dto.addSalesPerson(sales);
	        		
	        		//System.out.println(list.size());
	        		
	        		dto.getAllSalesPerson();
	        	
	        		//Collections.sort(list);
	        		
	        		//Collections.sort(list, new SalesPersonNameComparator());
	        		
	        		
	        		/*Iterator<SalesPersonDto> itr=list.iterator();
	            	  
	            	  while(itr.hasNext()) {
	            		  
	            		  SalesPersonDto pat=itr.next();  
	            		  
	            		  System.out.println(pat);
	            		  
	            		  
	            	  }*/
	            	  
	        		
	        	         		
	        		}	
	        		
	        	   }catch(Exception e) {
	        		System.out.println("invalid entry");
	        		
	        		e.printStackTrace();
	        	}
	        	finally {
	        		if(sc!=null) {
	        			sc.close();
	        			
	        		}
	        	}
	        		
	        	
	        }	
	
}
