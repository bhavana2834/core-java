package com.xworkz.waterfall.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.waterfall.dto.WaterFallDto;



public class WaterFallRepositoryImplemetation implements WaterFallRepository{
	
	
	String query;
	public WaterFallRepositoryImplemetation() {
		System.out.println("AirportRepository implementation ");
	}
	
	public WaterFallRepositoryImplemetation(String query) {
		this.query=query;
	}
	{
		System.out.println("repository implementation");
	}
    
	

	@Override
	public boolean onSave(WaterFallDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
		
			
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1,dto.getId());
			stmt.setString(2,dto.getFallName());
			stmt.setString(3,dto.getPlace());
			stmt.setInt(4, dto.getNoOfPeople());
			stmt.setString(5, dto.getStartingDestination());
			
			
			int i=stmt.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully ");
			}else {
				
				System.out.println("data not saved");
			}	
			
		}catch(Exception e) {
			System.out.println("class not found exception");
			
			
		}
		System.out.println("this is onSave");
		return true;
	}

	

}
