package com.Demo.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SendRedirectServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		String name=req.getParameter("uname");
		resp.sendRedirect("http://www.google.co.in/#q= "+name);
	}
}
