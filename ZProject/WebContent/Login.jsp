<%@ page import="com.*" %>

<html>
<head>
<title>login page</title>
</head>
<body>
<% Object ol=request.getAttribute("MSG");
if(ol!=null){
	out.println(ol);
}
%>
<form action="log.do">
<input type="hidden" name="sn" value="login"/>
enter-name<input type="text" name="un"/><br>
enter-password<input type="text" name="pw"/><br>
<input type="submit" value="login"/>
<a href="Regester.jsp">sign up </a> <br>
<a href="Forget.jsp">forget password </a>
</form>
</body>
</html>