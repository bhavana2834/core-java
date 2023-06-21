package com.xworkz.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTester {
	
               public static void main(String ar[]) {
               
               Queue data=new PriorityQueue();
                 
                 

              	data.add("Roopa");
              	data.add("Nidhi");
              	data.add("Dharani");
              	data.add("deena");
              	data.add("deena");
                //data.add(null);
              	
              	System.out.println("fetching the data using iterator");
              	Iterator itr=   data.iterator();
             	
             	while(itr.hasNext()) {
             	
             		Object obj=itr.next();
             		System.out.println(obj);
             
             		
             	}
             	System.out.println("removing all the data");
              	data.removeAll(data);
              	System.out.println(data);
             	System.out.println("fetching the data using string");
               
             	while(itr.hasNext()) {
               		
               		String obj=(String )itr.next();
               		System.out.println(obj);
               		
               		
               	}  	
                    	
                    	
                    	
                    	
                    }
}
