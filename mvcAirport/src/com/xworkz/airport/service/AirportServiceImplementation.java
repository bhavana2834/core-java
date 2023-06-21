package com.xworkz.airport.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.repository.AirportRepository;


public class AirportServiceImplementation implements AirportService{

	
	 AirportRepository airportRepository;

	public AirportServiceImplementation() {
	    System.out.println("airport service implementation");
	}
	
	public AirportServiceImplementation(AirportRepository airportRepository) {
		this.airportRepository=airportRepository;
		
	}
	
	@Override
	public boolean validateAndSave(AirportDto dto) {
		System.out.println("this is validateandSave");
		 if(dto!=null) {
				ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
				Validator valid=factory.getValidator();
				Set<ConstraintViolation<AirportDto>> violationMessages=valid.validate(dto);
				
				if(violationMessages.isEmpty()) {
					
					boolean save=this.airportRepository.onSave(dto);
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
	public boolean updateById(int id){
		System.out.println("this is updatebyid");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
		  
			String query="update basketball set place=? where id=?";
			
		  /* Statement statement =con.createStatement();
		   int i= statement.executeUpdate(query);
		   
			PreparedStatement stmt=con.prepareStatement(query);
		   
			stmt.setInt(1,"sira");
			
			
			int i=stmt.executeUpdate();
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
