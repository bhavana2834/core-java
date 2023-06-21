package com.xworkz.games.boot;

import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.repository.GamesRepository;
import com.xworkz.games.repository.GamesRepositoryImplementation;
import com.xworkz.games.service.GamesService;
import com.xworkz.games.service.GamesServiceImplementation;

public class GamesRunner {
	
	
	
            public static void main(String arg[]) {
    	
    	
    	    System.out.println("this is mvc project");
    	
    		GamesDto dto= new  GamesDto (1,"basketball", "india",21,1956);
    		
    		String query="insert into basketball values(?,?,?,?,?)";
    	   
    		GamesRepository repository = new GamesRepositoryImplementation(query);
    	
    	    GamesService service=new   GamesServiceImplementation(repository);
    	    service.validateAndSave(dto);
    	    service.updateOnId(2);
    	
    	
    	
    	
    	
    }
}
