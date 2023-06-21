package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CollectionTester {
      public static void main(String arr[]) {
    	  
    	 /* Object obj[]= {"bhavana",467,765.96,"seetha"};
    	  
    	  for(Object object:obj) {
    		  
    		  //group or collection of inbulit interfaces of classes.
    		  //obj[4]="888";cannot fetch 
    		  System.out.println(object);
    	  }*/
    	  
    	  /*Collection list=new ArrayList();
    	  
    	  list.add("bhavana");
    	  list.add(579);
    	  treeset(add the next value after the sop ) and hashset(duplicate)
    	  
    	  sort give collections object(collections related)
    	  System.out.println(list);*/
    	  
    	  
    	  Collection  list =new TreeSet();
    			  
    	  
    	  list.add("bhavana");
    	  list.add("balaji");
    	  list.add("rashmi");
    	  list.add("kshema");
    	  
    	  System.out.println(list.contains(""));
    	  list.add("navya");
    	  System.out.println(list);
    	  
    	  
    	  
      }
}
