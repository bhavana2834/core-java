package com.xworkz.collections;

import java.util.Comparator;

public class NameComparatorTree implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
