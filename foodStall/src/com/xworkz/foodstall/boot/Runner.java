package com.xworkz.foodstall.boot;

import com.xworkz.foodstall.dto.FoodDto;
import com.xworkz.foodstall.repository.FoodRepository;
import com.xworkz.foodstall.repository.FoodRepositoryImplementation;
import com.xworkz.foodstall.service.FoodService;
import com.xworkz.foodstall.service.FoodServiceImplementation;

public class Runner {
	
	public static void main(String[] args) {
		
		 FoodDto  dto = new  FoodDto (4,"bangarpete","pani puri",35);
		 
		
		 FoodRepository rep = new FoodRepositoryImplementation() ;
	
		 FoodService service = new FoodServiceImplementation(rep);
			
		// service.validateAndSave(dto);
		 // service.updateById(2);
		 service.readById(3);
		 //service.deleteById(2);
		
		
	}
	
	
	

}
