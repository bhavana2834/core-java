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
public class Team {
	
	
	public Team() {
		System.out.println("There are 10 teams in ipl");
	}
	
	  @Autowired
      private Players players;
}
