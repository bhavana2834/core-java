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
public class Rooms {
	public Rooms() {
		System.out.println("Rooms method have started");
	}
	
	
	@Value("To Cook")
	private String kitchen;
}
