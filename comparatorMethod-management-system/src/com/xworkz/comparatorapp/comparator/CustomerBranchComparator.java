package com.xworkz.comparatorapp.comparator;

import java.util.Comparator;

import com.xworkz.comparatorapp.dtoClasses.Customer;

public class CustomerBranchComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getBranch().compareTo(o2.getBranch());
	}

	
	
	
	
	
	
	
}
