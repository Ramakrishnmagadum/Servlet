<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 	instead of maintainning here , we can maintain this in web.xml for all JSP Pages.. -->
<%--     <%@page errorPage="error_page.jsp" %> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<form action="submit_Addition.jsp"> 
Num1 : <input name="num1"  type="text" ><br>
Num2 : <input name="num2"  type="text"><br>
<input type="reset" value="Cancel">  <input type="submit" value="Submit">
</form>

</body>
</html>

