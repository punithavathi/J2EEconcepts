<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String site = new String(
				"https://accounts.google.com/o/oauth2/auth?scope=email%20profile&state=%2Fprofile&"
						+ "redirect_uri=http://1-dot-loginoauth-1112.appspot.com/oauthlogin&"
						+ "response_type=code&"
						+ "client_id=68501642868-34o8v63k78cmifo974d8dgr14ogsmi8m.apps.googleusercontent.com");
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site);
	%>
</body>
</html>