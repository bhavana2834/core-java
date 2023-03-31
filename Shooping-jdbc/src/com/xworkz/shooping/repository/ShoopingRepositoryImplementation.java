package com.xworkz.shooping.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.shooping.dto.ShoopingDto;

public class ShoopingRepositoryImplementation implements ShoopingRepository {
      
	String query;
	
	public ShoopingRepositoryImplementation(String query) {
		this.query=query;
	}
	{
		System.out.println("shoopingRepositoryimplementation started");	
		
	}
	
	
	@Override
	public boolean onSave(ShoopingDto dto) {
		System.out.println("on save method started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			//String query="insert into shooping values(?,?,?) ";
			PreparedStatement pr=con.prepareStatement(query);
			
			pr.setInt(1, dto.getId());
			pr.setString(2,dto.getShopName());
			pr.setString(3, dto.getEmail());
			
			int i=pr.executeUpdate();
			if(i!=0) {
				System.out.println("save method on");
				
			}else {
				System.out.println("data not saved");
			}
			
			
			
		    }catch(Exception e) {
			
			e.printStackTrace();
		   }	
		return true;
	}

	@Override
	public boolean readByEmail(String email) {
		System.out.println("read by email started");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver method started");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
		String query="select *from shooping where email=?";
		PreparedStatement pr=con.prepareStatement(query);
		
		pr.setString(1, email);
		
		ResultSet rs=pr.executeQuery();
		
		while(rs.next()) {
			
			System.out.println("Id:"+rs.getInt(1)+" "+"shopName:" +rs.getString(2)+ "  "+"email:"+rs.getString(3) );
		}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean readByName(String name) {
		System.out.println("read by name started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="select *from shooping where shopName=?";
			
			PreparedStatement pr=con.prepareStatement(query);
		   
			pr.setString(1, name);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				
				System.out.println("Id:"+rs.getInt(1)+" "+"shopName:" +rs.getString(2)+ "  "+"email:"+rs.getString(3) );
			}
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
		
		
		
		return true;
	}

	@Override
	public boolean readAll(ShoopingDto dto) {
		System.out.println("read all method started started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="select *from shooping ";
			
			PreparedStatement pr=con.prepareStatement(query);
		  
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				
				System.out.println("Id:"+rs.getInt(1)+" "+"shopName:" +rs.getString(2)+ "  "+"email:"+rs.getString(3) );
			}
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
		return true;
	}

	@Override
	public boolean updateById(int id) {
		System.out.println("update  by id  started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="update shooping set shopName=? where id=?";
			
			PreparedStatement pr=con.prepareStatement(query);
			String shopName="Pothys";
			int id1=id;
			
			pr.setString(1, shopName);
			pr.setInt(2, id1);
			
			int i=pr.executeUpdate();
			if(i!=0) {
				
				System.out.println("update by id is done");
				
			}else {
				System.out.println("update by id not done");
			}
			
			
		}catch(Exception e) {
		e.printStackTrace();
			
		}
		return true;
	}

	@Override
	public boolean updateByName(String shopName) {
		System.out.println("update by name is started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="update shooping set email=? where shopName=?";
			
			PreparedStatement pr=con.prepareStatement(query);
			
			String email="bhava@gmail.com";
			String name1=shopName;
			
			pr.setString(1,email);
			pr.setString(2, name1);
			
			int i=pr.executeUpdate();
			
			if(i!=0) {
				
				System.out.println("update by name is done");
				
			}else {
				System.out.println("update by name not done");
			}
			
			
		}catch(Exception e) {
		e.printStackTrace();
			
		}
		return true;
	}

	@Override
	public boolean updateByEmail(String email) {
		System.out.println("update by email is started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			
			String query="update shooping set shopName=? where email=?";
			
			PreparedStatement pr=con.prepareStatement(query);
			
			String name="kshema";
			String email1=email;
			
			pr.setString(1, name);
			
			pr.setString(2, email1);
			
			
			int i=pr.executeUpdate();
			if(i!=0) {
				
				System.out.println("update by email is done");
				
			}else {
				System.out.println("update by email not done");
			}
			
			
		}catch(Exception e) {
		e.printStackTrace();
			
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		
		System.out.println("delete  by id is started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="delete from shooping where id=?";
			
			PreparedStatement pr=con.prepareStatement(query);
					
			pr.setInt(1, id);
			
			int i=pr.executeUpdate();
			if(i!=0) {
				
				System.out.println("delete by id is done");
				
			}else {
				System.out.println("delete by id not done");
			}
			
			
		}catch(Exception e) {
		e.printStackTrace();
			
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {

		System.out.println("delete  by id is started");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver method started");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
			String query="delete from shooping where email=?";
			
			PreparedStatement pr=con.prepareStatement(query);
					
			pr.setString(1, email);
			
			int i=pr.executeUpdate();
			if(i!=0) {
				
				System.out.println("delete by email is done");
				
			}else {
				System.out.println("delete by email not done");
			}
			
			
		}catch(Exception e) {
		e.printStackTrace();
			
		}
		return true;
	}
	
	
	
	
	
	
	

}
