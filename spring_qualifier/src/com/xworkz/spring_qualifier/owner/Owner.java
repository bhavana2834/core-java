package com.xworkz.spring_qualifier.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring_qualifier.restuarant.Restuarant;

import lombok.Getter;
import lombok.Setter;
@Setter
@Component
@Getter
public class Owner {
	
	@Autowired
	@Qualifier("indraprasta")
	Restuarant restuarant;
	
	

}
