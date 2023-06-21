package com.xworkz.games.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.repository.GamesRepository;

public class GamesServiceImplementation  implements GamesService {

	    GamesRepository gamesRepository;

        
         public GamesServiceImplementation() {
         System.out.println("games  service implemenatation");
         }


        public GamesServiceImplementation(GamesRepository gamesRepository) {
	      this.gamesRepository=gamesRepository;
	
         }

              @Override
              public boolean validateAndSave(GamesDto dto) {
	           System.out.println("this is validateandSave");
	           if(dto!=null) {
					ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
					Validator valid=factory.getValidator();
					Set<ConstraintViolation<GamesDto>> violationMessages=valid.validate(dto);
					
					if(violationMessages.isEmpty()) {
						
						boolean save=this.gamesRepository.onSave(dto);
						System.out.println(save);
						
					}else {
						
						System.out.println(violationMessages.toString());
					}
					
				}else {
					
					System.out.println("dto is null");
					
				}	
				return true;
			}


			@Override
			public boolean updateOnId(int id) {
				
				System.out.println("this is updatebyid");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
				    String query="update basketball set place='bangalore' where id="+"  '"+id+"' ";
					
				   Statement statement =con.createStatement();
				   int i= statement.executeUpdate(query);
				   if(i!=0) {
					   
					   System.out.println("update done ");   
				   }
				   else {
					   System.out.println("update not done");
				   }	
				  
				}catch(Exception e ) {
				e.printStackTrace();	
				}
			  return true;
			}


	
	
	
}
