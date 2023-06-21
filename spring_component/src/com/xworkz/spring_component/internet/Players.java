package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@Component
public class Players {
	
	
	public Players() {
		System.out.println("There are 11 players in the team");
	}
	
    @Value("Cricket")
	private String gameType;
	
}
