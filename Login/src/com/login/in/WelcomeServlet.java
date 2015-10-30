package com.login.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String n=req.getParameter("uname");
		out.println("Welcome" + " " +n);
		
	}
}
