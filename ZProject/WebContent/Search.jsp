<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.*" %>>
<html>
<head>

<title>Search</title>
</head>
<body>
<%Object o2=request.getAttribute("RB");
ResultBean rb1=(ResultBean)o2; %>
hi your results are
user name is:<%= rb1.getUn()%>
email is:<%= rb1.getEmail()%>
phone is:<%= rb1.getPhone()%>

<a href="home.jsp">search again</a>
</body>
</html>