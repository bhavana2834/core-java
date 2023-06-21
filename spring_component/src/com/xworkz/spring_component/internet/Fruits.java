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
public class Fruits {
	
	
	public Fruits() {
		System.out.println("By using the fruits we prepare fruits");
	}
	
	
	@Value("gives the fruits")
	private String tree;

	

}
