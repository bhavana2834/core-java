package com.xworkz.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayManager {
             public static void main(String arg[]) {
            	 
            	 List<Manager> data=new LinkedList<Manager>();
            	 
            	 data.add(new Manager(1,"Prakash","mba",4986533511L,"male"));
            	 data.add(new Manager(2,"raghu","mca",96324677L,"male")); 
            	 data.add(new Manager(3,"Sushmita","BE",9632478797L,"female")); 
            	 data.add(new Manager(4,"vinod","bca",73168999L,"male"));
            	 data.add(new Manager(5,"saritha","bcom",567446889L,"female"));
            	 
			//	Iterator list=data.iterator();
            	 
            	 Collections.sort(data,new NameComparator());
            	 
            	 Iterator<Manager> itr=data.iterator(); 
            	 
            	 while(itr.hasNext()) {
            		 
            		Manager mng=itr.next();
            		System.out.println(mng);
            		 	 
            	 }
            	 	 
            	 
             }
}
