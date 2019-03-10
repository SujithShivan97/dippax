<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">
		<!-- to display side bar  -->
            <div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
           </div>

		<!--  to display the actual products -->
          <div class="col-md-9">
			
			<!--  added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true }">
					
					

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home" class="äctive">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true }">
					
					
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>

				</div>
				</div>
				</div>
				</div>
				</div>

			
			
</body>
</html>