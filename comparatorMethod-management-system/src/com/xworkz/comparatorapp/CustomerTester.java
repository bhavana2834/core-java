package com.xworkz.comparatorapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.comparatorapp.comparator.CustomerBranchComparator;
import com.xworkz.comparatorapp.comparator.CustomerCityComparator;
import com.xworkz.comparatorapp.dtoClasses.Customer;

public class CustomerTester {
       public static void main(String arg[]) {
    	   
    	   List<Customer> data=new ArrayList<Customer>();
    	   
    	   
     	  data.add(new Customer(1,"Bhavana","sira","tumkur","bhavna@gmail.com"));
     	  data.add(new Customer(2,"Kshema","udupi","mangalore","kshema@gmail.com"));
     	  data.add(new Customer(3,"dlakshmi","banashankari","bangalore","lakshmi@gmail.com"));
     	  data.add(new Customer(4,"navya","mysore","mysore","navya@gmail.com"));
     	  
    	   
     	 // Collections.sort(data, new CustomerBranchComparator());
     	  Collections.sort(data,new CustomerCityComparator());
     	  
     	 Iterator<Customer> itr =data.iterator();
   	     while(itr.hasNext()) {
   		  
   		  Customer cust=itr.next();
   		  System.out.println(cust);
   		  
   		  
   	  }  
     	  
    	   
       }
}
