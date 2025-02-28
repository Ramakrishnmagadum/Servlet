<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    
<!--     Will use here JSTL Libarary -->
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Page</h1>
<c:if test="${true}">
<h3>Welcome to If Statement</h3>
</c:if>

<c:set var="cities" value="New York, London, Tokyo" />
<c:forEach var="city" items="${cities.split(',')}">
    <p>City: ${city}</p>
</c:forEach>

<c:forEach var="i" begin="1" end="5">
    <p>Number: ${i}</p>
</c:forEach>

<fmt:formatDate value="<%= new java.util.Date() %>" pattern="yyyy-MM-dd HH:mm:ss" />


</body>
</html>