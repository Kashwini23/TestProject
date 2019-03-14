<%@ page import="com.*" %>
<html>
<head>

<title>Recover</title>
</head>
<body>
<%Object o2=session.getAttribute("RB");
ResultBean rb2=(ResultBean)o2; %>

Hi your question is : <%=rb2.getSq()%>


<%Object ol=session.getAttribute("MSG");
if(ol!=null){
	out.println(ol);
}
%>
<form action="Forget.do">
<input type="hidden" name="sn" value="recover"/>
<input type="hidden" name="un" value="<%=rb2.getUn()%>"/>
enter security Ans<input type="text" name="sa" /><br>
<input type="submit" value="get  password" />
</form>
</body>
</html>