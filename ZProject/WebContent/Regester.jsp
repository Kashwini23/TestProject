<%@ page import="com.*" %>
<html>
<head>
<title>Register</title>
</head>
<body>
<%Object ol=request.getAttribute("MSG");
if(ol!=null){
	out.println(ol);
}
%>
<form action="Reg.do">
<input type="hidden" name="sn" value="Register"/>
enter name<input type="text" name="un" /><br>
enter password<input type="password" name="pw" /><br>
enter email<input type="text" name="email" /><br>
enter phone<input type="text" name="phone" /><br>
enter security question<input type="text" name="sq" /><br>
enter security answer<input type="text" name="sa" /><br>
<input type="submit" name="register" />
</form>
</body>
</html>