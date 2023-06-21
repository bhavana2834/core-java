package com.xworkz.boot;

public class BhavanaRunner {
       BhavanaDTO prashant= new BhavanaDTO(2, "gokak", 8548058481l, "B.E");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
		String querry="insert into prashant(id,place,mobilenumber,qualification)values(?,?,?,?)";
		PreparedStatement statement =connection.prepareStatement(querry);
		statement.setInt(1, prashant.getId());
		statement.setString(2, prashant.getPlace());
		statement.setLong(3, prashant.getMobilenumber());
		statement.setString(4, prashant.getQualification());
		int i=statement.executeUpdate();
		if(i!=0) {
			System.out.println(" insert done");
		}else {
			System.out.println("not done");
		}
//		=====================================================================
		ResultSet rs =statement.executeQuery("select * from prashant");
		while(rs.next()) {
			System.out.println("id :"+rs.getInt(1)+" "+"place :"+rs.getString(2)+"mobile number :"+rs.getLong(3)+"qualification :"+rs.getString(4));
		}
}
