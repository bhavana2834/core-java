package com.xworkz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListQueueSet {
	        
                     public static void main(String arg[]) {
                    	 
                    	 List<String>  data=new ArrayList<String>();
                    	 
                    	 data.add("Navya");
                    	 data.add("Kshema");
                    	 data.add("Lakshmi");
                    	 data.add("Bhavana");
                    	 data.add("Pooja");
                    	 
                    	 
                    	 System.out.println("fetching the data using generics string");
                    	 Iterator itr=data.iterator();
                    	 
                    	 while(itr.hasNext()) {
                    		 String obj =(String)itr.next();
                    		// itr.remove();
                    		 System.out.println(obj);
                    		  
                    	 }
                    	 
                    	 
                    	 Queue<Integer> data1=new PriorityQueue<Integer>();
                    	 
                    	 data1.add(578);
                    	 data1.add(9642);
                    	 data1.add(776);
                    	 data1.add(94179);
                    	 data1.add(0521567);
                    	 
                    	 System.out.println("fetching the data in generic Integer");
                    	 
                    	 Iterator itr1 =data1.iterator();
                    	 
                    	 while(itr1.hasNext()) {
                    		 
                    		 Integer inte=(Integer)itr1.next();
                    		 System.out.println(inte);
                    		 
                    	 }
                    	 
                    	 Set<Long> data2=new HashSet<Long>();
                    	 
                    	 data2.add(9090908976L);
                    	 data2.add(85678986413L);
                    	 data2.add(914689990L);
                    	 data2.add(93159977L);
                    	 data2.add(1904321689L);
                    	 
                    	 System.out.println("fetching the data in generic Long");
                    	 
                    	 Iterator itr2=data2.iterator();
                    	 
                    	 while(itr2.hasNext()) {
                    		 
                    		Long value=(Long)itr2.next();
                    		System.out.println(value);
                    		 
                    	 }
                    	 
                     }
}
