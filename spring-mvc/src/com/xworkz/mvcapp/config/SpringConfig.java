package com.xworkz.mvcapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mvcapp.controller.dto.AmusementParkDto;



@Configuration
@ComponentScan(basePackages = "com.xworkz.mvcapp")
public class SpringConfig {
	
	
	@Bean
	public List<AmusementParkDto> getList(){
		
		return new ArrayList<AmusementParkDto>();
		
		
	}
	
	@Bean
	 AmusementParkDto getAmusementParkDto() {
		
		AmusementParkDto  amusementParkDto=new AmusementParkDto();
		
		amusementParkDto.setAmusementParkId(1);
		amusementParkDto.setAmusementParkName("WonderLa");
		amusementParkDto.setCityName("Bangalore");
		amusementParkDto.setAdress("Ramnagar");
		amusementParkDto.setArea("Mysore Road");
		amusementParkDto.setEnytryFee(1500);
		
		return amusementParkDto;
	}
	
	

}
