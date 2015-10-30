package com.login.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)  
            throws ServletException, IOException {  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
req.getRequestDispatcher("link.html").include(req,res);
String name=req.getParameter("userName");
String password=req.getParameter("pass");

if(password.equals("admin123"))
{
	out.println("you sucessfully login the page");
	out.println("welcome" + " "+name);
	Cookie c=new Cookie("name",name);
	res.addCookie(c);
}
else
{
	out.print("sorry your username and password is wrong");
	req.getRequestDispatcher("link.html").include(req,res);
}

out.close();

}
}
