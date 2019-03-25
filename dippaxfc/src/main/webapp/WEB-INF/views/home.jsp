<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Right Here Homie</title>
</head>
<body>
<div class="col-lg-3">
			<!-- SideBar of 3 categories -->
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">

			<div class="row carousel-holder">

				<div class="col-md-12">

					<div id="carousel-example-generic" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0"
								class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							<li data-target="#carousel-example-generic" data-slide-to="3"></li>
						</ol>
						<div class="carousel-inner">
							<div class="item active">
								<img class="slide-image" src="${images}/c1.jpg"
									alt="First slide" width="900" height="350">
							</div>
							<div class="item">
								<img class="slide-image" src="${images}/c2.jpg"
									alt="Second slide" width="900" height="350">
							</div>
							<div class="item">
								<img class="slide-image" src="${images}/c4.jpg"
									alt="Third slide" width="900" height="350">
							</div>
							<div class="item">
								<img class="slide-image" src="${images}/c.jpg"
									alt="Fourth slide" width="900" height="350">
							</div>
						</div>
						<a class="left carousel-control" href="#carousel-example-generic"
							data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left"></span>
						</a> <a class="right carousel-control"
							href="#carousel-example-generic" data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div>
				</div>
			</div>
			
			<div class="row">
                	<div class="col-xs-12">
                		<h3>Our Most Viewed Items</h3>
                		<hr/>
                	</div>
                </div>
<div class="row">

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/womenfashion.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Girlies</a>
                  </h4>
                  <h5>Hey Girl</h5>
                  <p class="card-text">Check out the latest collections of fashion clothing here girlies!</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/girlsshoes.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Girlies - Shoes for you </a>
                  </h4>
                  <h5>Hey Girl</h5>
                  <p class="card-text">Check out the latest collections of shoes here girlies.</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/girlsaccess.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Girlies Accessorie</a>
                  </h4>
                  <h5>Hey Girl</h5>
                  <p class="card-text">Check out your Fav Accesories here girlies!</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/menfashion.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Boyies </a>
                  </h4>
                  <h5>Hey Boie</h5>
                  <p class="card-text">Check out the latest collections of fashion clothing here Boyies!</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/menshoes.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Boyies - Shoes for you</a>
                  </h4>
                  <h5>Hey Boie</h5>
                  <p class="card-text">Check out the latest collections of shoes here Boyies.</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/menaccess.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="#">Boyies Accessorie</a>
                  </h4>
                  <h5>Hey Boie</h5>
                  <p class="card-text">Check out your Fav Accesories here Boyies!</p>
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

<!-- Footer -->
		<%@include file="shared/footer.jsp" %>
  
          </div>
          <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

      </div>
      <!-- /.row -->

                
</body>
</html>