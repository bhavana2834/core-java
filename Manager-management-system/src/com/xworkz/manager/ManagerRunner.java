package com.xworkz.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


 
public class ManagerRunner {
                

				public static void main(String arg[]) {
                	  
                   List<ManagerDto> list =new ArrayList<ManagerDto>();                	  
                	  
                     list.add(new ManagerDto(1,"Prakash","MBA",4986533511L,50000));
                	 list.add(new ManagerDto(3,"Raghu","MCA",96324677L,65988)); 
                	 list.add(new ManagerDto(2,"Sushmita","BE",9632478797L,34677)); 
                	 list.add(new ManagerDto(5,"Vinod","BCA",73168999L,25776));
                	 list.add(new ManagerDto(4,"Saritha","BCOM",567446889L,26877));
                	 
                	 
                	 System.out.println("get the maximum salary ");
                	 System.out.println(list.stream().max(Comparator.comparing(ManagerDto::getSalary)));
                	 System.out.println("get the minimum salary ");
                	 System.out.println(list.stream().min(Comparator.comparing(ManagerDto::getSalary)));
                	 
                	 System.out.println("sorting the data using using id");
                	 System.out.println(list.stream().sorted(Comparator.comparing(ManagerDto::getManagerId)).collect(Collectors.toList()));
                	 System.out.println("sorting the data using using salaray");
                	 System.out.println(list.stream().sorted(Comparator.comparing(ManagerDto::getSalary)).collect(Collectors.toList())); 
                	
                	 System.out.println("sorting the data using using name");
                	 System.out.println(list.stream().sorted(Comparator.comparing(ManagerDto::getManagerName).reversed()).collect(Collectors.toList()));
    
                	 List<ManagerDto> listSalary=list.stream().filter(values->(values.getSalary()<=50000)).collect(Collectors.toList());
                	 System.out.println(listSalary);
                	  
                  }
}
