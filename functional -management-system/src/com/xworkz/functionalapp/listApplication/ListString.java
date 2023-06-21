package com.xworkz.functionalapp.listApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListString {
              public static void main(String arg[]) {
            	  
            	  
            	  List<String> list=new ArrayList<String>();
            	  
            	  list.add("bhavana");
            	  list.add("kshema");
            	  list.add("lakshmi");
            	  list.add("navya");
            	  list.add("spurthi");
            	  list.add("deepika");
            	  
            	 // list.stream().filter(ref ->(ref.length()>4)).forEach(ref1 -> System.out.println(ref1));
            	  
            	 System.out.println(list);
            	  
            	  List<String> listOfNumbers1= list.stream().filter(ref->ref.equals("reshma")).collect(Collectors.toList());
              	  System.out.println(listOfNumbers1);
            	  
             	   System.out.println("fecth the data using equals method to a string"); 
                   list.stream().filter(ref ->ref.equals("deepika")).forEach(p->System.out.println(p));
              
               
              }
}
