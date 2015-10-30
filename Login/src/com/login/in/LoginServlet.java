package com.login.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String n=req.getParameter("uname");
	String p=req.getParameter("upass");
	if(p.equals("punitha"))
	{
		RequestDispatcher rq=req.getRequestDispatcher("servlet2");
		rq.forward(req,resp);
	}
	else{
		out.print("Sorry usernmae and password is wrong");
		RequestDispatcher rq=req.getRequestDispatcher("/index.html");
		rq.include(req,resp);
	}
	}
}
