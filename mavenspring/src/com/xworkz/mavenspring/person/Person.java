package com.xworkz.springcomponent.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.springcomponent.addess.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
@Component
@NoArgsConstructor
public class Person {
	
	@Value("1")
	private int id;
	@Value("Bhavana")
	private String name;
	@Autowired
	private Address address;
	
	
	

}
