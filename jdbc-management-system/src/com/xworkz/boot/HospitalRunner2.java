package com.xworkz.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HospitalRunner2 {
	public static void main(String arg[]) {
	   	  
	  	   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded sucessfully");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MARRIAGE", "root", "Xworkzodc@123");
				String query =  "update hospital set name ='essential' where id=1 ";
				
				Statement statement =con.createStatement();
				int i=statement.executeUpdate(query);
				System.out.println(i);
				
				if(i!=0) {
					System.out.println("update  done");	
				}else {
					
					System.out.println("update is not done");
				}
				//ResultSet result=statement.executeQuery(query);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	  	   

	  	   
	     }

}
