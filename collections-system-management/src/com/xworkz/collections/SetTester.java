package com.xworkz.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
            
	           public static void main(String set[]) {
	        	   
	        	   Object PRESENT =new Object();
	        	   
	        	   Object obj=null;
	        	   
	        	   System.out.println(PRESENT=null);
	        	   
	        	   
	        	   
	        	   Set data=new HashSet();
	            	
	            	System.out.println("fetching the data using hashset");
	            	data.add("Roopa");
	            	data.add("Nidhi");
	            	data.add("Dharani");
	            	data.add("deena");
	            	data.add(4879890456L);
	            	data.add("deena");//it will not accept duplicate values
	            	data.add(null);//accept null value but once.
	            	data.add("null");
	            	
	            	
	            	System.out.println(data);
	            	
            	Set data1=new LinkedHashSet();
            	
            	System.out.println("fetching the data using LinkedListset");
            	data1.add("Roopa");
            	data1.add("Nidhi");
            	data1.add("Dharani");
            	data1.add("deena");
            	data1.add(4879890456L);
            	data1.add("deena");//it will not accept duplicate values
            	data1.add(null);//accept null value but once.
            	data1.add("null");
            	data1.add(487989043686L);
            	
            	
            	System.out.println(data1);
            	Set data2=new TreeSet();
            	System.out.println("fetching the data using treeset");
            	data2.add(56);
            	data2.add(86);
            	data2.add(883);
            	data2.add(48);//it will not accept duplicate values
            	data2.add(531);
            	data2.add(null);//it will not accept null values
            	data2.add(null);
            	
            	//data2.add("bhavana"); either we need to give integer or string value
                 //data2.add("kshema");	
                 
            	System.out.println("fetching the data using the iterator");
            	Iterator itr=data1.iterator();
            	
            	while(itr.hasNext()) {
            		Object obj1=itr.next();
            		
            		System.out.println(obj1);	
            	}
            	
            	/*System.out.println("fecthing the data remove the data");
            	Iterator itr1=data2.iterator();
            	
            	while(itr1.hasNext()) {
            		
            		//Object obj2=itr1.next();
            		Object obj2=itr1.remove();
            		//itr1.remove();
            		System.out.println(data2);
            	}*/
            	
            	
            	
            	
            }
            
            
}
