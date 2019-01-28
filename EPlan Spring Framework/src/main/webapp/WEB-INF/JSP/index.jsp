<%@include file="header.jsp"%>
<link rel="stylesheet" href="eplan_style.css">
<h3>Welcome. . . !</h3>
<!--   <a href="/homePage"> Go to Home Page </a> -->

<form action="/home" name="" method="get">
	<div class="panel panel-success">
		<div class="panel-heading">Eplan</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-sm-3 "
					style="text-align: right; padding: 10px 57px;">
					<label for="model"> Select Your Product </label>
				</div>
				<div class="col-sm-4">
					<select id="productSel" name="productSel">
						<option value="" selected disabled="disabled">Choose Your
							Product</option>
						<c:forEach items="${productList}" var="productList">
							<option value="${productList.id}">${productList.displayName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-sm-4"></div>
			</div>

			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4"></div>
				<div class="col-sm-4" style="text-align: right;">
					<button class="btn btn-primary">Cancel</button>
					<button class="btn btn-primary" type="submit">Submit</button>
				</div>
			</div>

		</div>
	</div>
</form>

<%@include file="footer.jsp"%>