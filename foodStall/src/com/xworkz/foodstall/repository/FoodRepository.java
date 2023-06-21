package com.xworkz.foodstall.repository;

import com.xworkz.foodstall.dto.FoodDto;


public interface FoodRepository {


	abstract boolean onSave(FoodDto dto);
	abstract boolean updateById(int id);
	abstract boolean readById(int id);
	abstract boolean  deleteById(int id );
	
}
