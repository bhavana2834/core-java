package com.xworkz.mvcapp.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.repository.AmusementParkRepository;

import lombok.Data;
import lombok.ToString;
@ToString
@Component
public class AmusementParkRepositoryImpl implements AmusementParkRepository {
	
    @Autowired
	List<AmusementParkDto> dtos;
	
	
	@Override
	public AmusementParkDto save(AmusementParkDto dto)  throws AmusementParkException {
		System.out.println("Save method created");
		
		System.out.println("AmusementParkDto object created");
		
		AmusementParkDto  amusementpark=new AmusementParkDto();
		
		boolean isAdded=false;
		
		if(dto!=null) {
			
		isAdded=dtos.add(dto);
		}
		if(isAdded) {
			
			amusementpark=dto;
		}
		
		System.out.println("Save method Ended");
		
				return amusementpark;
				
	
	}
	
}
