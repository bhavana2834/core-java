package com.xworkz.functionalapp.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
                     public static void main() {
                    	 
                    	List<String> list2 =new ArrayList<String>(); 
                    	 
                    	 list2.add("bhavana");
                    	 list2.add("spurthi");
                    	 list2.add("divya");
                    	 list2.add("gagana");
                    	 list2.add("deepika");
                    	 list2.add("madhu");
                    	 list2.add("yaseen");
                    	 list2.add("dawood");
                    	 list2.add("lakshmi");
                    	 list2.add("reshma");
                    	 list2.add("sagar");
                    	 
                    	 System.out.println(list2);
                    	 
                    	 
                    	 List<String> listOfNumbers1= list2.stream().filter(ref->(list2.equals("reshma"))).collect(Collectors.toList());
                    	 System.out.println(listOfNumbers1);
                    	 
                    	 
                    	 
                     }
}
