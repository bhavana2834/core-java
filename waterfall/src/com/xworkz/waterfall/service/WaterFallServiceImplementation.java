package com.xworkz.waterfall.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.waterfall.dto.WaterFallDto;
import com.xworkz.waterfall.repository.WaterFallRepository;


public class WaterFallServiceImplementation implements WaterFallService{
	
	 
	WaterFallRepository waterFallRepository;
	
	public  WaterFallServiceImplementation() {
	    System.out.println("airport service implementation");
	}
	
	
	
	public WaterFallServiceImplementation(WaterFallRepository waterFallRepository) {		
		this.waterFallRepository=waterFallRepository;
	}
	
	@Override
	public boolean validateAndSave(WaterFallDto dto) {
		System.out.println("this is validateandSave");
		 if(dto!=null) {
				ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
				Validator valid=factory.getValidator();
				Set<ConstraintViolation<WaterFallDto>> violationMessages=valid.validate(dto);
				
				if(violationMessages.isEmpty()) {
					
					boolean save=this.waterFallRepository.onSave(dto);
					System.out.println(save);
					
				}else {
					
					System.out.println(violationMessages.toString());
				}
				
			}else {
				
				System.out.println("dto is null");
				
			}	
			return true;
		}



	@Override
	public boolean updateById(int id) {
		// TODO Auto-generated method stub
		return false;
	}



	

}
