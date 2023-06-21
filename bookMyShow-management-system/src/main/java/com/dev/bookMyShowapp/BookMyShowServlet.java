package com.dev.bookMyShowapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/user")
public class BookMyShowServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException{
		
		String firstName=req.getParameter("firstName");
		String movieName=req.getParameter("movieName");
		String ticketPrice=req.getParameter("ticketPrice");
		
		PrintWriter wrt=new PrintWriter(resp.getWriter());
		
		
		wrt.print("<html>"
				    +"<body>"
				   +"<h2>Welcome to Book My show  application "+firstName+"</h2>"
				   +"</body>"   
				   +"</html>");		
	}
	
	

}
