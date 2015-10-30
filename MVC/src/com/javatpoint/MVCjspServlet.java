package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MVCjspServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("uname");
		String pass=req.getParameter("upass");
		LoginBean bean=new LoginBean();
		bean.setName(name);
		bean.setPassword(pass);
		req.setAttribute("bean",bean);
		boolean status=bean.validate();
		if(status)
		{
			RequestDispatcher rd=req.getRequestDispatcher("login-sucess.jsp");
			rd.forward(req,resp);
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("login-error.jsp");
			rd.forward(req,resp);
		}
	}
}
