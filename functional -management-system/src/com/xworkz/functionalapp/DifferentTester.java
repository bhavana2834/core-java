package com.xworkz.functionalapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentTester {
              public static void main(String arg[]) {
            	  
            	  List<Integer>  list=new ArrayList<Integer>();
            	  
            	  list.add(78);
            	  list.add(479);
            	  list.add(489);
            	  list.add(280);
            	  list.add(904);
            	  
            	  Iterator<Integer>  itr=list.iterator();
            	  System.out.println("fetching the data using the iterator");
            	  
            	  while(itr.hasNext()) {
            		Integer integerValues=itr.next();  
            		 System.out.println(integerValues);
            		if(integerValues%2==0) {
            			
            			System.out.println("even number");
            			
            		}else {
            			
            			System.out.println("odd number");
            		}
            		  
            	  }
            	  
            	  
            	  System.out.println("fetching the data using filter");
            	  List<Integer> listOfEvenNumbers  =list.stream().filter(integerValues -> (integerValues%2==0)).collect(Collectors.toList());
            	  System.out.println(listOfEvenNumbers );
            	  
            	  System.out.println("fetching the data using stream");
            	  list.stream().forEach(integerValues-> System.out.println(integerValues));
            	  
            	  
            	  
            	  
            	  
            	  
              }                  
}
