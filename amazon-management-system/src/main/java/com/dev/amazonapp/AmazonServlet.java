package com.dev.amazonapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/user")
public class AmazonServlet extends HttpServlet{

	
	public AmazonServlet() {
		System.out.println("Amazon object is created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException{
		try {
		String userName=req.getParameter("userName");
		String phoneNumber=req.getParameter("phoneNumber");
		String email =req.getParameter("email");
		String loginThrough =req.getParameter("loginThrough");
		
		
		req.setAttribute("key", userName);
		
		RequestDispatcher disp=req.getRequestDispatcher("response.jsp");
		disp.forward(req, resp);
		
		
		        
	   		 Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("driver loaded sucessfully");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket", "root", "Xworkzodc@123");
				String query ="insert into userinfo1 values(?,?,? ,?)";
			   PreparedStatement stmt = con.prepareStatement(query);
			   stmt.setString(1,userName );
			   stmt.setString(2,phoneNumber);
			   stmt.setString(3,email );
			   stmt.setString(4,loginThrough );
			   int i=stmt.executeUpdate();
			   if(i!=0) {
				   
			   System.out.println("data is saved");
			   }else {
				   
				   System.out.println("data is not saved ");
			   }
			   }catch(Exception e) {
				   System.out.println("invalid data");
				   e.printStackTrace();
			   }
		
			   
				
			
		
	   	   
		 
		
		
		/*PrintWriter wrt=new PrintWriter(resp.getWriter());
		
		
		wrt.print("<html>"
				    +"<body>"
				   +"<h2>Welcome to Amazon application "+userName+"</h2>"
				   +"</body>"   
				   +"</html>");*/
	}
	
	
	
	
	
}
