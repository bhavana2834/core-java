package com.xworks.distributorapp.comparator;

import java.util.Comparator;

import com.xworks.distributorapp.distributor.SalesPersonDto;

public class AgeComparator   implements Comparator< SalesPersonDto> {

	

	
	@Override
	public int compare(SalesPersonDto o1, SalesPersonDto o2) {
		
		return o1.getAge().compareTo(o2.getAge());
	}

}
