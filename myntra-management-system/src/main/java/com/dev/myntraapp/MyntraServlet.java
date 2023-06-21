package com.dev.myntraapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/user")
public class MyntraServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException{
		
		String userName=req.getParameter("userName");
		String phoneNumber=req.getParameter("phoneNumber");
		String email=req.getParameter("email");
		String orderType=req.getParameter("orderType");
		
		
		PrintWriter wrt=new PrintWriter(resp.getWriter());
		
		
		wrt.print("<html>"
				    +"<body>"
				   +"<h2>Welcome to our application "+userName+"</h2>"
				   +"</body>"   
				   +"</html>");		
	}
}
