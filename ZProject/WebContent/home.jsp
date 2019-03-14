<%@ page import="com.*" %>
<html>
<head>

<title>home</title>
</head>
<body>
<%Object o2=request.getAttribute("NA");
if(o2!=null){
	out.println(o2);
}
%><br>
<%Object ol=request.getAttribute("MSG");
if(ol!=null){
	out.println(ol);
}
%>
<form action="Home.do">
<input type="hidden" name="sn" value="home"/>
enter email<input type="text" name="email" /><br>
<input type="submit" name="search" />
</form>
</body>
</html>