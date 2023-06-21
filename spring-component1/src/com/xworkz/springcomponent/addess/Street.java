package com.xworkz.springcomponent.addess;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
@Component
public class Street {
	
	
	@Value("HouseNo 97")
	private String streetNo;
	
	

}
