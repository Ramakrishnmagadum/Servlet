<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- this is Page Directive Tag with Import Attribute -->
<%@page import="java.util.random.* , java.util.Date"%>

<!-- This is Info Tag we can set info of the Jsp ,and letter we can retrive this by using ServletInfo() Method -->
<%@page info="Page Directive Jsp Page " %>

<!-- By Default Buffer size is 8kb , we can customize this size -->
<%@ page buffer="16kb" %>  

<!-- This is used to define Error Page , if exceptions occuers in current page then it will redirect to Error page -->
<%@ page errorPage="myerrorpage.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		Random Number :
		<!-- Scriptlet tag -->
		<%
		Random random = new Random();
		int num = random.nextInt(100);
		%>

		<!-- Expression Tag -->
		<%=num%>
		<br>
		<%=new Date()%>
		
		<%= getServletInfo() %>

	</h3>
</body>
</html>