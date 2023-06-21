package com.xworkz.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AirportRunner {
	
	  public static void main(String arg[]) {
    	
		  
   	   try {
   		   Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded sucessfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MARRIAGE", "root", "Xworkzodc@123");
			String query ="select*from airport";
			Statement statement =con.createStatement();
			ResultSet result=statement.executeQuery(query);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
   	   

   	   
      }
}
