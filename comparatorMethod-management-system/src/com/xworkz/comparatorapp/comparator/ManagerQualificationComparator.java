package com.xworkz.comparatorapp.comparator;

import java.util.Comparator;

import com.xworkz.comparatorapp.dtoClasses.Manager;

public class ManagerQualificationComparator  implements Comparator<Manager> {

	@Override
	public int compare(Manager o1, Manager o2) {
		// TODO Auto-generated method stub
		return o1.getQualification().compareTo(o2.getQualification());
	}

}
