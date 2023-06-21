package com.xworkz.mvcapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;
import com.xworkz.mvcapp.repository.AmusementParkRepository;
import com.xworkz.mvcapp.service.AmusementParkService;





@Component
public class AmusementParkServiceImpl implements AmusementParkService {
	
	@Autowired
	private AmusementParkRepository repo;

	@Override
	public AmusementParkDto validateAnsSave(AmusementParkDto dto) throws AmusementParkException {
		
		System.out.println("Validtae And Save method started");
		
		
		AmusementParkDto amusementParkDto=new AmusementParkDto();
		
		
		System.out.println("object creation in service implementation");
		
		
		boolean isIdPresent = false;
		boolean isNamePresent=false;
		boolean isCityName=false;
		boolean isAreaPresent=false;
		boolean isAdressPresent=false;
		boolean isFeePresent=false;
		
		
		if(dto.getAmusementParkId()>0)
			isIdPresent=true;
			
		
		if(dto.getAmusementParkName()!=null&& !dto.getAmusementParkName().isEmpty())
		isNamePresent=true;
		
		if(dto.getCityName()!=null && !dto.getCityName().isEmpty())
			isCityName=true;
		
		if(dto.getArea()!=null && !dto.getArea().isEmpty())
			isAreaPresent=true;
		
		if(dto.getEnytryFee()>0)
		isIdPresent=true;
		
		if(dto.getAdress()!=null && !dto.getAdress().isEmpty())
			isAdressPresent=true;
		
		System.out.println("validate and save");
		
		if( isIdPresent==true && isNamePresent==true && isCityName==true && isAdressPresent==true && isAreaPresent==true && isFeePresent==true) {
			System.out.println("invoke repo to store the data");
			
			amusementParkDto=repo.save(dto);
			
			System.out.println("successfully returned dto from repo");
		}
		
		return amusementParkDto;
	}
	
	
	
	

}
