package com.Cookie.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CookieServlet2  extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	Cookie c[]=req.getCookies();
	pw.println("hello"  + " " + c[0].getValue());
	pw.close();
	
}
}