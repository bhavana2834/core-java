package com.xworkz.cricket.boot;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repository.CricketRepository;
import com.xworkz.cricket.repository.CricketRepositoryImplementation;
import com.xworkz.cricket.service.CricketService;
import com.xworkz.cricket.service.CricketServiceImplementation;

public class CricketRunner {
	

public static void main(String arg[]) {
    	
    	
    	      System.out.println("this is mvc project");
    		  CricketDto dto= new CricketDto(1,"ipl", "bangalore ","chennai","dubai");
    		
    		  String query="insert into game values(?,?,?,?,?)";
    	   
    		  CricketRepository repository = new CricketRepositoryImplementation(query);
    	
    	      CricketServiceImplementation service=new   CricketServiceImplementation(repository);
    	     
    	      service.validateAndSave(dto);
    	      service.updateById(3);
}
}