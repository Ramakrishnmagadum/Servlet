<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="CRUD_Project.DAO" %>
     <%@page import="CRUD_Project.StudentsBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>
<%String name =request.getParameter("name"); 
StudentsBean bean=DAO.getrecord(name);
String name2 =bean.getName();
String email =bean.getEmail();
String country =bean.getCountry();
String sex =bean.getSex();
%>
<form action="edituser2.jsp" method="post">
Name : <input type="text" name="name" value="<%=name2%>" disabled="disabled"><br>
Email : <input type="text" name="email" value="<%=email%>" ><br>
Country : <select name="country" value="<%=country%>">
<option>India</option>
<option>Pak</option>
<option>China</option>
</select> <br>
<input type="submit"> 
</form>

</body>
</html>