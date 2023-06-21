package com.xworkz.mvcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.service.AmusementParkService;


@Component
@Scope(value="prototype")
public class AmusementParkController {
	
	
	@Autowired
	private AmusementParkService amusementParkService ;
	
	//processing of dto and return the same
	//argument no 1; AmusementDto 
	//no of argument:1
	//
	public AmusementParkDto process(AmusementParkDto dto) throws AmusementParkException{
		System.out.println("process method started");
		try {
			
			if(dto!=null) {
				System.out.println("Service implemenation object is created");
				
				 amusementParkService.validateAnsSave(dto);
			
				
			}else {
				
				
			}	
		}catch(AmusementParkException e){
			
			e.printStackTrace();
			throw new AmusementParkException();
			
		}	
		
		System.out.println("Process method ended");
		return dto;	
	}
	

}
