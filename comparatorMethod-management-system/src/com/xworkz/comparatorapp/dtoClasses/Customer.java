package com.xworkz.comparatorapp.dtoClasses;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@AllArgsConstructor

public class Customer {
	

	private int CustomerId;
	private String Name;
	private  String branch;
	private String city;
	private String email;
	
	
}
