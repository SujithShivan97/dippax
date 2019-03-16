<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />



<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>DIPPAX - ${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}'
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap readable theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="shared/navbar.jsp"%>
		
		<!-- Page Content -->
		<div class="content">

			<!--  Loading the home content -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>
			<!--  load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- load only when user clicks contact -->

			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			<c:if
				test="${userClickViewProducts == true or userClickCategoryProducts == true }">
				<%@include file="listProducts.jsp"%>
			</c:if>

		</div>

		<!-- Footer -->
		<%@include file="shared/footer.jsp" %>

		<!-- jquery -->
		<script src="${js}/jquery.js"></script>
		<!-- Bootstrap core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		<!--  data table -->
		<script src="${js}/jquery.dataTables.js "></script>

		<!--  data table bootstrap js -->

		<script src="${js}/dataTables.bootstrap.js "></script>

		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
