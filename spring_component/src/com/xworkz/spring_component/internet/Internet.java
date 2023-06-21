package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
@Component


public class Internet {
	
	
	public Internet() {
		System.out.println("internet method started");
	}
	
	@Autowired
	private Browser browser;
	
	
	

}
