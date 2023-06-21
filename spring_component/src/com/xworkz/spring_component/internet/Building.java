package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
@Component
@Data
public class Building {
	public Building() {
		System.out.println("Building will have rooms");
	}
	
	
	@Autowired
	private Rooms rooms;;
}
