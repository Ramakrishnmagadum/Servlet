<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="CRUD_Project.DAO" %>
    <%@page import="CRUD_Project.StudentsBean" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view User</title>
</head>
<body>


<% 
List<StudentsBean> list=DAO.getAllRecords(); 

%>
<table border="1px solid black" >
<tr><th>Name</th> <th>Email</th> <th>Sex</th> <th>Country</th> <th>Edit</th> <th>Delete</th> </tr>
<%for(int i=0;i<list.size();i++) {%>
<tr>
<td ><%=list.get(i).getName() %></td>
<td ><%=list.get(i).getEmail() %></td>
<td ><%=list.get(i).getSex() %></td>
<td ><%=list.get(i).getCountry() %></td>

<td><a href='edituser.jsp?name=<%=list.get(i).getName()%>'>Edit </a></td>
<td><a href='deleteuser.jsp?name=<%=list.get(i).getName()%>'>Delete </a></td>
</tr>
<%} %>
</table>

<a href="adduser.jsp"> Add User</a>
</body>
</html>