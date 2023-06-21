package com.xworkz.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Customer implements Comparable<Customer> {
	
	
	
	private int CustomerId;
	private String Name;
	private  String branch;
	private String city;
	private String email;
	@Override
	public int compareTo(Customer o) {
		
		// TODO Auto-generated method stub
		return this.CustomerId-o.CustomerId;
	}
}
