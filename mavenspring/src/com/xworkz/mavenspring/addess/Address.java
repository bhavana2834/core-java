package com.xworkz.mavenspring.addess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.springcomponent.addess.Country;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
@Component
public class Address {
	
	
	@Value("India")
	private String countryName;
	@Autowired
	private Country country;

}
