package com.xworkz.cricket.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.cricket.dto.CricketDto;

public class CricketRepositoryImplementation implements CricketRepository{
	
	
	
	String query;


	public CricketRepositoryImplementation() {
		System.out.println("AirportRepository implementation ");
	}
	
	
	public CricketRepositoryImplementation(String query) {
		this.query=query;
	}
	{
		System.out.println("repository implementation");
	}
    
	@Override
	public boolean onSave(CricketDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1,dto.getId());
			stmt.setString(2,dto.getGameName());
			stmt.setString(3,dto.getPlace());
			stmt.setString(4, dto.getTeam());
			stmt.setString(5, dto.getTeam2());
			
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
