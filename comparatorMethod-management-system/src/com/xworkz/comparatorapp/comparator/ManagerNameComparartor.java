package com.xworkz.comparatorapp.comparator;

import java.util.Comparator;

import com.xworkz.comparatorapp.dtoClasses.Manager;

public class ManagerNameComparartor implements Comparator<Manager>{

	@Override
	public int compare(Manager o1, Manager o2) {
		
		return  o1.getManagerName().compareTo(o2.getManagerName());
	}
      
}
