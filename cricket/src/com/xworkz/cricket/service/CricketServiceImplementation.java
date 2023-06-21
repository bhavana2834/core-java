package com.xworkz.cricket.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.repository.CricketRepository;


public class CricketServiceImplementation implements CricketService{
	     CricketRepository cricketRepository;


         public CricketServiceImplementation() {
	     System.out.println("cricket service implemenatation");
           }
		
		
		public CricketServiceImplementation(CricketRepository cricketRepository) {
			this.cricketRepository=cricketRepository;
			
		}
		
		@Override
		public boolean validateAndSave(CricketDto dto) {
			System.out.println("this is validateandSave");
			if(dto!=null) {
				ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
				Validator valid=factory.getValidator();
				Set<ConstraintViolation<CricketDto>> violationMessages=valid.validate(dto);
				
				if(violationMessages.isEmpty()) {
					
					boolean save=this.cricketRepository.onSave(dto);
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
		public boolean updateById(int id) {
			System.out.println("this is updatebyid");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			   String query="update basketball set place='bangalore' where id="+"'"+id+"'";
				
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
