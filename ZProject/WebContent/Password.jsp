<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>

<title>password</title>
</head>

<body>
Hi Your Password is: 
<%Object o2=request.getAttribute("PA");
if(o2!=null){
	out.println(o2);
}
%>  <br>
<a href="Login.jsp">login again </a>
</body>
</html>