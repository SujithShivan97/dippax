<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<!-- Breadcrumb -->
		<div class="row">
			<div class="col-xs-12">

				<ol class=breadcrumb>

					<li><a href="${contextRoot}/home">HOME</a></li>
					<li><a href="${contextRoot}/show/all/products">Products</a></li>
					<li class="active">${product.name}</li>

				</ol>

			</div>

			<div class="row">
				<!-- Displaying Product Image -->
				<div class="col-xs-12 col-sm-4"></div>

				<div class="thumbnail">

					<img src="${images}/${product.code}.jpg" class="img img-responsive" />

				</div>


			</div>


			<!-- Displaying Product Description -->
			<div class="col-xs-12 col-sm-4"></div>

			<h3>${product.name}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				Price: <strong> &#8377; ${product.unitPrice} /-</strong>
			</h4>
			<hr />

					<h6>Qty.Available: ${product.quantity}</h6>
					
					<c:choose>
					<c:when test="${product.quantity <1}">
					<h6>Qty.Available: <span style="color:red">OUT OF STOCK</span></h6>
					</c:when>
					<c:otherwise>
					<h6>Qty.Available: ${product.quantity}</h6>
					</c:otherwise>
					</c:choose>
					
					<c:choose>
					<c:when test="${product.quantity <1}">
					<a href="javascript.void(0)" class="btn btn-success disabled"><strike>
					<span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</strike></a>
					
					</c:when>
					<c:otherwise>
					<a href="${contextRoot}/cart/add/${product.id}/product>" class="btn btn-success">
					<span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</a>
					
					</c:otherwise>
					</c:choose>
					
					
					
					<a href="${contextRoot}/show/all/listProducts>" class="btn btn-primary">
					Back</a>
					

				
			

		</div>







	</div>


</body>
</html>