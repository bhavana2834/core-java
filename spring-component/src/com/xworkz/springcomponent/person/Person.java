package com.xworkz.springcomponent.person;

import com.xworkz.springcomponent.addess.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter

public class Person {
	
	private int id;
	private String name;
	private Address address;
	
	
	

}
