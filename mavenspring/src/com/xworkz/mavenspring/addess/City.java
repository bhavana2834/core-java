package com.xworkz.mavenspring.addess;

import org.springframework.beans.factory.annotation.Autowired;
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
public class City {
	
    @Value("Jyothinagar")
	private String areaName;
    @Autowired
	private Area area;
	
}
