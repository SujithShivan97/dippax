<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><b>CheckOut!</b></title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<p class="lead">CheckOut Here Homies</p>
<div class="list-group">

<c:forEach items="${categories}" var="category">

<a href="#" class="list-group-item">${category.name}</a>



</c:forEach>

</div>



</body>
</html>