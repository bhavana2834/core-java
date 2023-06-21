package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Component
@ToString
@Data
@AllArgsConstructor

public class Viewers {
	
	
	public Viewers() {
		System.out.println("Viewers are watching the show");
	}
	
	@Value("Television show")
	private String tv;

}
