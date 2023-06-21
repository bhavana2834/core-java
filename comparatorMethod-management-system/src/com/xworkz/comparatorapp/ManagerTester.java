package com.xworkz.comparatorapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.comparatorapp.comparator.ManagerNameComparartor;
import com.xworkz.comparatorapp.comparator.ManagerQualificationComparator;
import com.xworkz.comparatorapp.dtoClasses.Manager;

public class ManagerTester {
                   public static void main(String arg[]) {
                	   
                	   List<Manager> data=new ArrayList<Manager>();
                	   
                	 data.add(new Manager(1,"Prakash","MBA",4986533511L,"male"));
                  	 data.add(new Manager(2,"Raghu","MCA",96324677L,"male")); 
                  	 data.add(new Manager(3,"Sushmita","BE",9632478797L,"female")); 
                  	 data.add(new Manager(4,"Vinod","BCA",73168999L,"male"));
                  	 data.add(new Manager(5,"Saritha","BCOM",567446889L,"female"));
                	   
                  	 Collections.sort(data, new ManagerNameComparartor());
                	 Collections.sort(data, new ManagerQualificationComparator());
                	   Iterator<Manager> itr=data.iterator();
                	   
                	   while(itr.hasNext()) {
                		   
                		   Manager manager=itr.next();
                		   System.out.println(manager);
                		   
                		   
                	   }
                	   
                	   
                	   
                	   
                   }
}
