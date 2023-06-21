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
public class Apllication {
	
	
	public Apllication() {
		System.out.println("Apllication will be used by clients");
	}
	
	
	@Value("To browse the information")
	private String google;
	

}
