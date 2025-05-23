<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"></link>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="text-center text-primary mt-3">
       <c:choose>
       		<c:when test="${Message ne null}">
       		    ${Message}
       		</c:when>
       		<c:otherwise>
       			${wishMessage}
       		</c:otherwise>
       </c:choose>
   </div>  
</body>
</html>