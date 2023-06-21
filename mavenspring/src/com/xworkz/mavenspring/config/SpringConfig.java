package com.xworkz.springcomponent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springcomponent.person.Person;


@Configuration
@Component
public class SpringConfig {

	
	@Bean
	public Person getPerson() {
		
		return new Person();		
	}
	
	
	
	
	
	
	

}
