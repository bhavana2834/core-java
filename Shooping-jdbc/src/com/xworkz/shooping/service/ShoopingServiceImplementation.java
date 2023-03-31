package com.xworkz.shooping.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shooping.dto.ShoopingDto;
import com.xworkz.shooping.repository.ShoopingRepository;


public class ShoopingServiceImplementation implements ShoopingService {

	
	ShoopingRepository shoopingRespository;
	
	
	public ShoopingServiceImplementation() {
		System.out.println("shooping service implementation started");
	}
	public ShoopingServiceImplementation(ShoopingRepository shoopingRespository) {
		this.shoopingRespository=shoopingRespository;
	}
	
	
	@Override
	public boolean validateAndSave(ShoopingDto dto) {
		System.out.println("validate and save method started");
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator valid=factory.getValidator();
			Set<ConstraintViolation<ShoopingDto>> violationMessages=valid.validate(dto);
			
			
			if(violationMessages.isEmpty()) {
				
				boolean save=this.shoopingRespository.onSave(dto);
				System.out.println(save);
				
			}else {
				
				System.out.println(violationMessages.toString());
			}			
		}else {
			
			System.out.println("data not saved ");
		}	
		return true;
	}

	@Override
	public boolean readByEmail(String email) {
		
		if(email!=null) {
			boolean save =this.shoopingRespository.readByEmail(email);
			System.out.println(save);
			System.out.println("read  done");
		}else {
			System.out.println("read not done");
		}
		return true;
		
	}

	@Override
	public boolean readByName(String name) {
		if(name!=null) {
			boolean save =this.shoopingRespository.readByName(name);
			System.out.println(save);
			System.out.println("read  done");
		}else {
			System.out.println("read not done");
		}
		
		return true;
	}

	@Override
	public boolean readAll(ShoopingDto dto) {
		
		if(dto!=null) {
			boolean save =this.shoopingRespository.readAll(dto);
			System.out.println(save);
			System.out.println("read  done");
		}else {
			System.out.println("read not done");
		}
		return true;
		
	}

	@Override
	public boolean updateById(int id) {
		if(id!=0) {
			boolean upById=this.shoopingRespository.updateById(id);
			System.out.println(upById);
			System.out.println("update done");
		}else {
			System.out.println("update not done");
		}
		return true;
	}

	@Override
	public boolean updateByName(String shopName) {
		if(shopName!=null) {
			boolean upByName=this.shoopingRespository.updateByName(shopName);
			System.out.println(upByName);
			System.out.println("update done");
		}else {
			System.out.println("update not done");
		}
		return true;
	}

	@Override
	public boolean updateByEmail(String email) {
		if(email!=null) {
			boolean upByEmail=this.shoopingRespository.updateByEmail(email);
			System.out.println(upByEmail);
			System.out.println("update done");
		}else {
			System.out.println("update not done");
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			boolean dlById=this.shoopingRespository.deleteById(id);
			System.out.println(dlById);
			System.out.println("delete done");
		}else {
			System.out.println("delete not done");
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		
		if(email!=null) {
			boolean dlByEmail=this.shoopingRespository.deleteByEmail(email);
			System.out.println(dlByEmail);
			System.out.println("delete done");
		}else {
			System.out.println("delete not done");
		}
		return true;
	}
	

}
