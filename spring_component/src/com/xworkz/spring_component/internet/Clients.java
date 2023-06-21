package com.xworkz.spring_component.internet;

import org.springframework.beans.factory.annotation.Value;
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
public class Clients {
	
	
	public Clients() {
		System.out.println("clients will deal with the company");
	}
	
	
	@Value("deal the projects")
	private String person;
	
	
	

}
