package com.xworkz.functionalapp.listApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFunction {
                      public static void main(String arg[]) {
                  List<Integer>  list=new ArrayList<Integer>();
                  
                  
                  
                    list.add(125);	
                    list.add(276);	  
                    list.add(68);	  
                    list.add(242);	  
                    list.add(98);	  
                    list.add(850);	  
                    list.add(186);	  
                    list.add(87);	  
                    list.add(972);	  
                    list.add(26);	  
                    list.add(199);	  
                    list.add(744);	  
                    list.add(19);	  
                    list.add(478);	  
                    list.add(66);
                    list.add(467);
                    list.add(245);
                    list.add(35);
                    
                    System.out.println("fetching the data using stream");
                    List<Integer> listOfNUmbers=list.stream().filter(integerValues-> (integerValues>100)).collect(Collectors.toList());	  
                    	  System.out.println(listOfNUmbers);
                    	  
                    	  
                  List<Integer> listOfNumbers1=list.stream().filter(integerValues-> (integerValues<100)).collect(Collectors.toList());	  
                    	  System.out.println(listOfNumbers1);
                     System.out.println(list); 	  
                    	  
                     
                    	  
                    	  
                    	  
                      }
}
