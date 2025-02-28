<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="CRUD_Project.DAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Page</title>
</head>
<body>
<% 
String name=request.getParameter("name");
DAO.deletestudent(name); %>
<h3>Deleted Successfully </h3>
<jsp:include page="viewuser.jsp"></jsp:include>

</body>
</html>