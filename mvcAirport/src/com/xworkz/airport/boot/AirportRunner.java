package com.xworkz.airport.boot;

import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.repository.AirportRepository;
import com.xworkz.airport.repository.AirportRepositoryImplementation;
import com.xworkz.airport.service.AirportService;
import com.xworkz.airport.service.AirportServiceImplementation;

public class AirportRunner {
    public static void main(String arg[]) {
    	
    	
    	System.out.println("this is mvc project");
    		AirportDto dto= new AirportDto(2,"bangalore", "bangalore airport road", 2, 56,76, 87);
    		String query="insert into basketball values(?,?,?,?,?)";
    	   
    		AirportRepository repository = new AirportRepositoryImplementation(query);
    	      repository.updateById(1);
    	     AirportService service=new   AirportServiceImplementation(repository);
    	     service.validateAndSave(dto);
            
    	
    }
}
