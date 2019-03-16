<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="../shared/flows-header.jsp" %>	
		<div class="container">

	<div class="row">
	
		
		<div class="col-sm-offset-4 col-sm-4">
			<div class="text-center">		
				<h1>Welcome!</h1>
				<h3>Dippax</h3>
				<h6>You can use your email address as username to login!</h6>
				<div>
					<a href="${contextRoot}/login" class="btn btn-lg btn-success">Login Here</a>
				</div>
			</div>
		</div>
	
	
	</div>
	

</div>	
		<%@include file="../shared/flows-footer.jsp" %>
		
</body>
</html>