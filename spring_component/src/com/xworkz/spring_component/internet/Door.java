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


public class Door {
	
	public Door() {
		System.out.println("Door method started");
	}
	
	
	@Value("To enter")
	private String door;

}
