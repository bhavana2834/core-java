package com.xworkz.foodstall.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.foodstall.dto.FoodDto;

public  class FoodRepositoryImplementation implements FoodRepository{

	@Override
	
	
	public boolean onSave(FoodDto dto) {
		
		
		System.out.println("onsave method started ");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			 String query="insert into food1 values(?,?,?,?)";
			
			 PreparedStatement pr = con.prepareStatement(query);	
			 pr.setInt(1, dto.getId());
			 pr.setString(2, dto.getStoreName());
			 pr.setString(3 , dto.getFoodItem());
             pr.setInt(4, dto.getPrice());
             
             int i = pr.executeUpdate();
             
             if(i!= 0) {
            	 System.out.println("data saved");
             }
             else {
            	 System.out.println("data not saved");
             }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				return true;
	   }
	
	@Override
	public boolean updateById(int id) {
		System.out.println("update method started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			String query="update food1 set storeName=? where id=?";
			PreparedStatement pr = con.prepareStatement(query);
			
			String storeName="abcd";
			int id1=id;
			
			pr.setString(1,storeName);
			pr.setInt(2, id1);
			
			int i=pr.executeUpdate();
			
			if(i!=0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
						
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			return true;
	}

	@Override
	public boolean readById(int id) {
		
		System.out.println("read method started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			String query="select*from food1 where id=?";
			PreparedStatement pr = con.prepareStatement(query);
			
			pr.setInt(1, id);
			
			ResultSet rs=pr.executeQuery();
			
			while(rs.next()) {
				
			System.out.println("Id:"+rs.getInt(1)+" "+ "storeName:" +rs.getString(2));
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return true;
		
		
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("deleate method started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			String query="delete from food1 where id=?";
			PreparedStatement pr = con.prepareStatement(query);
			
			pr.setInt(1, id);
			
			int i=pr.executeUpdate();
			
		
			if(i!= 0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}
			
		   }catch(Exception e) {
			
			e.printStackTrace();
		}
			return true;
	}

}
