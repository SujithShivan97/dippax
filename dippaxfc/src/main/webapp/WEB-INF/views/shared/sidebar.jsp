<p class="list">Make a Choice</p>



<div class="list-group">

<c:forEach items="${categories}"  var="category">

<a href="${contextRoot }/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name} </a>

</c:forEach>
            
            
            
          </div>