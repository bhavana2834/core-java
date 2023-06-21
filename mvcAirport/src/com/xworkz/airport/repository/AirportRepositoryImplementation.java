package com.xworkz.airport.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.airport.dto.AirportDto;

public class AirportRepositoryImplementation implements AirportRepository {

	String query;
	public AirportRepositoryImplementation() {
		System.out.println("AirportRepository implementation ");
	}
	
	public AirportRepositoryImplementation(String query) {
		this.query=query;
	}
	{
		System.out.println("repository implementation");
	}
    
	

	@Override
	public boolean onSave(AirportDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1,dto.getId());
			stmt.setString(2,dto.getAirport_name());
			stmt.setString(3,dto.getPlace());
			stmt.setInt(4, dto.getNoOfCountry());
			stmt.setInt(5, dto.getNoOfPeoples());
			stmt.setInt(5, dto.getNoOfinterNational());
			stmt.setInt(5, dto.getTerminals());
			
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

	public boolean updateById(int id) {
		System.out.println("this is updatebyid");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
		  
			String query="update basketball set place=? where id=?";
			
		  /* Statement statement =con.createStatement();
		   int i= statement.executeUpdate(query);*/
		   
			PreparedStatement stmt1=con.prepareStatement(query);
		   
			String name="abcd";
			
			int id1=id;
			
			
			int i1=stmt1.executeUpdate();
		   if(i1!=0) {
			   
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
