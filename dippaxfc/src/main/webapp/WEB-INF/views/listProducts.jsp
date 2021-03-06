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
						<c:if test="${userClickViewProducts == true}">
							<script>
								window.categoryId = '';
							</script>

							<ol class="breadcrumb">

								<li><a href="${contextRoot}/home" class="�ctive">Home</a></li>
								<li class="active">All Products</li>

							</ol>
						</c:if>


						<c:if test="${userClickCategoryProducts == true}">

							<script>
								window.categoryId = '${category.id}';
							</script>
							<ol class="breadcrumb">

								<li><a href="${contextRoot}/home">Home</a></li>
								<li class="active">Category</li>
								<li class="active">${category.name}</li>

							</ol>
						</c:if>

					</div>
				</div>

				<div class="col-xs-12">
					<table id="productListTable"
						class="table table-striped table-borderd">
						<thead>
							<tr>

								
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty.Available</th>
								<th></th>


							</tr>


						</thead>
						
						<tfoot>
						<tr>
						
						        
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty.Available</th>
								<th></th>
						
						</tr>
						
						
						</tfoot>
						
						





					</table>

				</div>


			</div>


		</div>
	</div>


</body>
</html>