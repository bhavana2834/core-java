package com.dev.patientapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dev.patientapp.dto.PatientDTO;

@Repository
public class PatientRepositoryImpl implements PatientRepository {

	@Override
	public PatientDTO save(PatientDTO dto) {
		System.out.println("save method started in repo");
		
		PatientDTO pat=new PatientDTO();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			String querry="insert into patient1 values(?,?,?,?,?)";
			PreparedStatement statement =connection.prepareStatement(querry);
			
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getPatientName());
			statement.setString(3, dto.getAge());
			statement.setString(4, dto.getBloodGroup());
			statement.setString(5, dto.getEmail());
			
			int i=statement.executeUpdate();
			if(i!=0) {
			System.out.println("data added");
		pat=dto;
			
		}else {
			System.out.println("not added");
		}		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return pat;
	}

	@Override
	public List<PatientDTO> getPatient() {
		
		System.out.println("inside get patient method in repo");
		
		List<PatientDTO> list = new ArrayList<PatientDTO>();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			String querry="select * from patient1";
			PreparedStatement statement =connection.prepareStatement(querry);
			
			ResultSet rs=statement.executeQuery();
			
			while(rs.next()) {
				
			PatientDTO dtos=new PatientDTO();	
			
			dtos.setId(rs.getInt(1));
			dtos.setPatientName(rs.getString(2));
			dtos.setAge(rs.getString(3));
			dtos.setBloodGroup(rs.getString(4));
			dtos.setEmail(rs.getString(5));
				

			list.add(dtos);
			
	}
	         } catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
        }

        return list;
        }

	@Override
	public List<PatientDTO> getPatientName(String patientName) {
		System.out.println("get patient name in repo");
		List<PatientDTO> list = new ArrayList<PatientDTO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			String querry="select * from patient1 where patientName= "+"'"+patientName+"'";
			PreparedStatement statement =connection.prepareStatement(querry);
			ResultSet rs=statement.executeQuery();
			
			while(rs.next()) {
				
			PatientDTO dtos=new PatientDTO();
			
			dtos.setId(rs.getInt(1));
			dtos.setPatientName(rs.getString(2));
			dtos.setAge(rs.getString(3));
			dtos.setBloodGroup(rs.getString(4));
			dtos.setEmail(rs.getString(5));
				

			list.add(dtos);
			
	}
	} catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
}

return list;
}

	@Override
	public PatientDTO getPatientById(int id) {
		System.out.println("get patient by id in repo");
     PatientDTO list =new PatientDTO();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			String querry="select*from patient1 where id= ?";
			PreparedStatement statement =connection.prepareStatement(querry);
			ResultSet rs=statement.executeQuery();
			
			while(rs.next()) {
				
			PatientDTO dtos=new PatientDTO();
			
			dtos.setId(rs.getInt(1));
			dtos.setPatientName(rs.getString(2));
			dtos.setAge(rs.getString(3));
			dtos.setBloodGroup(rs.getString(4));
			dtos.setEmail(rs.getString(5));
				
			list=dtos;
			
	}
	} catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
      }
		return list;

		
	}

	@Override
	public void updateById(PatientDTO dto) {
     System.out.println("save method started in repo");
		
		PatientDTO pat=new PatientDTO();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			
			PreparedStatement statement =connection.prepareStatement("update patient1 set PatientName=?,age=?,bloodGroup=?,email=? where id=?");
			
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getPatientName());
			statement.setString(3, dto.getAge());
			statement.setString(4, dto.getBloodGroup());
			statement.setString(5, dto.getEmail());
			
			int i=statement.executeUpdate();
			if(i!=0) {
			System.out.println("data added");
		pat=dto;
			
		}else {
			System.out.println("not added");
		}		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public PatientDTO DeletePatientById(int id) {
		System.out.println("delete patient id in repo");
		PatientDTO pat=new PatientDTO();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/olympics", "root", "Xworkzodc@123");
			
			PreparedStatement statement =connection.prepareStatement("delete from patient1 where id=?");
			
			
			statement.setInt(1, id);
						
			int i=statement.executeUpdate();
			if(i!=0) {
				
			System.out.println("data deleted");
			
			
		}else {
			
			System.out.println("not deleted");
			
		}	
		
			
		}catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
		}
		return pat;
		
	}
	
	
	

	
	
	
	
	
	
	
	
	}
	
	


