<%@include file="header.jsp" %>
<h3>Welcome. . . ! </h3>
<a href="/homePage"> Go to Home Page </a> 

<label for="product">Select Your Product</label>
		
		<select id="productSel" class="form-control" >
		<option value ="" selected disabled="disabled">Choose Your Product</option>
		<c:forEach items="${productList}"  var="productList">
		<option value="${productList.id}" >${productList.displayName}</option>
		</c:forEach>
		</select>
		
		
<%@include file="footer.jsp" %>