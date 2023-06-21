package com.xworkz.mavenspring.addess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.springcomponent.addess.Street;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
@Component

public class Area {
	
	
    @Value("Ram Mandir")
	private String streetName;
    @Autowired
	private Street street;
	
	
}
