package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@Component

public class Browser {
	
	
	public Browser() {
		
	System.out.println("browser method started");	
	}
	
	@Value("net")
	private String web;

}
