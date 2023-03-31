package com.xworkz.shooping.boot;

import com.xworkz.shooping.dto.ShoopingDto;
import com.xworkz.shooping.repository.ShoopingRepository;
import com.xworkz.shooping.repository.ShoopingRepositoryImplementation;
import com.xworkz.shooping.service.ShoopingService;
import com.xworkz.shooping.service.ShoopingServiceImplementation;

public class Runner {
	
	public  static void main(String arg[]) {
		
		ShoopingDto dto=new ShoopingDto(6, "max", "max@gmail.com");
     String query="insert into shooping values(?,?,?)";
		
		
		ShoopingRepository repo=new ShoopingRepositoryImplementation(query);
		
		ShoopingService  service=new ShoopingServiceImplementation(repo);
		
		 //service.validateAndSave(dto);
		//service.readByEmail("trends@gmail.com");
		//service.readByName("Pothys");
		//service.readAll(dto);
		//service.updateById(6);
		// service.updateByName("roopa");
		//service.updateByEmail("max@gmail.com");
		 //service.deleteById(2);
		 service.deleteByEmail("max@gmail.com");
		
	}
	
	
	
	

}
