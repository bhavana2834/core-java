package com.xworkz.foodstall.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.foodstall.dto.FoodDto;
import com.xworkz.foodstall.repository.FoodRepository;


public class FoodServiceImplementation implements FoodService {

	FoodRepository repo ;
	
	public FoodServiceImplementation(FoodRepository repo ) {
		this.repo = repo;
	}
	
	
	@Override
	public boolean validateAndSave(FoodDto dto) {
		System.out.println("this is validate and save");
		if(dto != null) {
			ValidatorFactory fac =  Validation.buildDefaultValidatorFactory();
			Validator valid = fac.getValidator();
			Set<ConstraintViolation<FoodDto>> set = valid.validate(dto);
			if(set.isEmpty()) {
				boolean save = this.repo.onSave(dto);
				System.out.println(save);
			}else {
				System.out.println(set.toString());
			}
			
		}else {
			System.out.println("dto  is null");
		}
			return true;
	   }

	@Override
	public boolean updateById(int id) {
		if(id != 0) {
			boolean up = this.repo.updateById(id);
			System.out.println(up);
			System.out.println("updated");
		}else {
			System.out.println("not updated");
		}	
		return true;
	}

	
	@Override
	public boolean readById(int id) {
		boolean save = this.repo.readById(id);
		System.out.println(save);
		return true;
	}

	
	
	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			boolean dl = this.repo.deleteById(id);
			System.out.println(dl);
			System.out.println("deleted");
		}else {
			System.out.println("not deleted ");
		}
				return true;
	}

}
