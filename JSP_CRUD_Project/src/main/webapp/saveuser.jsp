<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@page import="CRUD_Project.DAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save User</title>
</head>
<body>

<jsp:useBean id="student" class="CRUD_Project.StudentsBean"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>

<%
int i =DAO.savestudent(student);
if(i>0){
	response.sendRedirect("successpage.jsp");
}else{
	response.sendRedirect("errorpage.jsp");
}
%>



</body>
</html>