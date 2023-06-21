package com.xworks.distributorapp.distributor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworks.distributorapp.comparator.AgeComparator;
import com.xworks.distributorapp.comparator.SalesPersonNameComparator;

public class DistributorImpl implements DistributorDto{
	
	
              List<SalesPersonDto> salesPersons;
              
              public DistributorImpl() {
            	 salesPersons =new ArrayList<SalesPersonDto>();  
              }

			@Override
			public boolean addSalesPerson(SalesPersonDto dto) throws Exception {
				System.out.println("inside addsalesperson with salepersons as a");
				
				boolean isAdded=false;
				if(dto!=null && dto.getId()>=1 &&dto.getSalesPersonName()!=null) {
					salesPersons.add(dto);
					System.out.println("salesperson data added sucessfully");
					
					isAdded=true;
				}else {
					System.out.println("data not entered");
				}
				
				return false;
			}

			@Override
			public List<SalesPersonDto> getAllSalesPerson() throws Exception {
				System.out.println("get salesperson method started");
				
				List<SalesPersonDto> dt=new ArrayList<SalesPersonDto>();
				  
				//Collections.sort(salesPersons, new AgeComparator());
				
				Collections.sort(salesPersons, new SalesPersonNameComparator());
        		
				
				Iterator<SalesPersonDto> itr =salesPersons.iterator();
				
				while(itr.hasNext()) {
					
					dt.add(itr.next());
					
				}
				System.out.println(dt);
				System.out.println("Salesperson method ended");
				
				
				return dt;
			}
			
              
              
              
              
              
              
              
              
}
