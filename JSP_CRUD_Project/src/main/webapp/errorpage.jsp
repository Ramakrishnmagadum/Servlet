<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
<p>Sorry, an error occurred!</p>  
<%= exception.getMessage() %><br>
<jsp:include page="adduser.jsp"></jsp:include>
</body>
</html>