package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListTester {
	
	
	
          public static void main(String li[]) {
        	  
        	List list=new ArrayList();  
        	 
        	list.add(0,"Spurthi");
        	list.add(1,"Divya");
        	list.add(2,43877);
        	list.add(3,588.24);
        	list.add(4,"Bhavana");
        	 list.add(5,null); //accept n number of null values
        	 list.add(6,null); 
        	 list.add(7,null); 
        	 list.add(8,null); 
        	 list.add(9,null); 
        	 list.add(10,"Bhavana"); //accept n number of duplicate values.
        	 list.add(11,"Spurthi");
        	
        	  System.out.println(list);
        	 //list.clear();
        	// System.out.println(list.get(3));
        	 //System.out.println(list.get(5));
        	 
        	 
        	 //for(Object obj:list) {
        		 
        		 //list.add(4);//if we add the data here ConcurrentModificationException
        		 
        		//System.out.print(obj + ","); 
        	  
        		System.out.println("fetching the dtaa using iterator");
        		Iterator itr =list.iterator();
        		
        		while(itr.hasNext()) {
        			
        		Object obj=itr.next();
        		System.out.println(obj);
        			
        			
        			
        		}
        		
        		
        		
        		
        		 
        	 }
        	  
        	  
          }

