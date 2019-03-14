<%@ page import="com.*" %>
<html>
<head>
<title>Forget</title>
</head>
<body>
<%Object ol=request.getAttribute("MSG");
if(ol!=null){
	out.println(ol);
}
%>
<form action="Forget.do">
<input type="hidden" name="sn" value="forget"/>
enter email<input type="text" name="email" /><br>
<input type="submit" name="get question" />
</form>
</body>
</html>