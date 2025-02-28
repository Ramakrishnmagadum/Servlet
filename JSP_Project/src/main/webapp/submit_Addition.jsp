<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- 	instead of maintainning here , we can maintain this in web.xml for all JSP Pages.. -->
<%-- 	<%@page errorPage="error_page.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>
	<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");

	int value1=Integer.parseInt(num1);
	int value2=Integer.parseInt(num2);
	int result =value1/value2;
	%>
	
	<div>Result is : <%=result %></div>
</body>
</html>