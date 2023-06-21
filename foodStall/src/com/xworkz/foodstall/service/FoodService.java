package com.xworkz.foodstall.service;

import com.xworkz.foodstall.dto.FoodDto;

public interface FoodService {
	
	
	
	abstract boolean validateAndSave(FoodDto dto);
	abstract boolean updateById(int id);
	abstract boolean readById(int id);
	abstract boolean deleteById(int id);

}
