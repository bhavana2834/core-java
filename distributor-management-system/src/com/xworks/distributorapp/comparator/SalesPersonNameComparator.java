package com.xworks.distributorapp.comparator;

import java.util.Comparator;

import com.xworks.distributorapp.distributor.SalesPersonDto;

public class SalesPersonNameComparator implements Comparator<SalesPersonDto>{

	@Override
	public int compare(SalesPersonDto o1, SalesPersonDto o2) {
		
		return o1.getSalesPersonName().compareTo(o2.getSalesPersonName());
	}

}
