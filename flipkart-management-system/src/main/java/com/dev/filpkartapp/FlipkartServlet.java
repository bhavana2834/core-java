package com.dev.filpkartapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/user")
public class FlipkartServlet  extends HttpServlet {
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException{
		
		String userName=req.getParameter("userName");
		String phoneNumber=req.getParameter("phoneNumber");
		String brandName=req.getParameter("brandName");
		String type=req.getParameter("type");
		
		
		PrintWriter wrt=new PrintWriter(resp.getWriter());
		
		
		wrt.print("<html>"
				    +"<body>"
				   +"<h2>Welcome to FlipKart application "+userName+"</h2>"
				   +"</body>"   
				   +"</html>");		
	}
	
	

}
