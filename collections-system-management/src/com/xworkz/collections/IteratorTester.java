package com.xworkz.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTester {
         public static void main(String it[]) {
        	 
        	Set data=new HashSet();
         	
         	data.add("Roopa");
         	data.add("Nidhi");
         	data.add("Dharani");
         	data.add("deena");
         	data.add(36798090L);
         	data.add(8765.836);
         	data.add(null);
         	data.add(null);
         
         	
         	System.out.println("fetching the data using the for each");
         	for(Object obj:data) {
         		
         		System.out.println(obj);
         	}
         	
         	
         	//System.out.println("fetching the data using iterator");
         	
         	Iterator itr=   data.iterator();
         	
         	/*while(itr.hasNext()) {
         		
         		Object obj=itr.next();
         		System.out.println(obj);
         		
         		
         	}*/
         	System.out.println("fetching the data using string");//
          while(itr.hasNext()) {
         		
         		String obj=(String )itr.next();
         		System.out.println(obj);
         		
         		
         	}
        	 
        	 
         }
}
