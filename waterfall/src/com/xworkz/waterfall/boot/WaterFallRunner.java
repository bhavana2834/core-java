package com.xworkz.waterfall.boot;

import com.xworkz.waterfall.dto.WaterFallDto;
import com.xworkz.waterfall.repository.WaterFallRepository;
import com.xworkz.waterfall.repository.WaterFallRepositoryImplemetation;
import com.xworkz.waterfall.service.WaterFallServiceImplementation;


public class WaterFallRunner {
	
	
	public static void main(String arg[]) {
		
	System.out.println("this is mvc project");
	
	WaterFallDto dto= new WaterFallDto(1,"tkfalls","mysore",5,"bangalore");
	
	String query="insert into fall values(?,?,?,?,?)";
   
	WaterFallRepository repository = new WaterFallRepositoryImplemetation(query);

	WaterFallServiceImplementation service=new   WaterFallServiceImplementation(repository);
     
     service.validateAndSave(dto);
     
	}
}
