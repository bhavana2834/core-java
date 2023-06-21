package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListTester {
          public static void main(String arg[]) {
        	  
        	  Set<Customer> customers =new TreeSet<Customer>();
        	  
        	  customers.add(new Customer(1,"Bhavana","Sira","Tumkur","bhavna@gmail.com"));
        	  customers.add(new Customer(2,"Kshema","udupi","mangalore","kshema@gmail.com"));
        	  customers.add(new Customer(3,"dlakshmi","banashankari","bangalore","lakshmi@gmail.com"));
        	  customers.add(new Customer(4,"navya","mysore","mysore","navya@gmail.com"));
        	  
        	  Iterator<Customer> itr =customers.iterator();
        	  while(itr.hasNext()) {
        		  
        		  Customer cust=itr.next();
        		  System.out.println(cust);
        		  
        		  
        	  }  
        	  
        	  
          }
}
