package com.login.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ProfileServlet  extends HttpServlet{
	
		protected void doGet(HttpServletRequest req, HttpServletResponse res)  
	            throws ServletException, IOException {  
	res.setContentType("text/html");  
	PrintWriter out=res.getWriter();  
	req.getRequestDispatcher("link.html").include(req,res);
	
	Cookie c[]=req.getCookies();
	if(c!=null)
	{
		String name=c[0].getValue();
		
		if(!name.equals("")||name!=null)
		{
			out.print("<b>Welcome to Profile</b>");
			out.print("<br>welcome," +name);
			
		}
		else
			
		{
			out.print("please login first");
			req.getRequestDispatcher("link.html").include(req, res);
		}
	}
	out.close();
}
}