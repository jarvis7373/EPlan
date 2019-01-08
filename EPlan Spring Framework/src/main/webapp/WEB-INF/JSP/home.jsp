
<%@include file="header.jsp"%>


  

<script>
$(document).ready(function () {
$('#productSel').change(function(){
	
var productId= $(this).val();
	$.get("/api/option?productId="+productId,function(data,status){
		data=data+"";
		var val=data.split(",");
		$('#model').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Model</option>");
	    if(val.length>2){
		for(var i=0;i<val.length;i++){
			$('#model').append("<option>"+val[i]+"</option>")
		
		}
	    }
		});
});
});


</script>

<body>
<br><br><br><br><br><br><br>
 

<div class="row">
<div class="col-sm-2"></div>
<div class="col-sm-8">
<div class="panel panel-primary">
      <div class="panel-heading">EPlan Details</div>
<br>	  
<table class="table table-bordered">
<tr >
<td rowspan="4">
  <label for="product">Select Your Product</label>
		<select id="productSel" class="form-control">
		<option value ="" selected disabled="disabled">Choose Your Product</option>
		<c:forEach items="${productList}"  var="productList">
		<option value="${productList.id}" >${productList.displayName}</option>
		</c:forEach>
		</select>
		 
</td>	
<td>
 <label for="product">Model</label>
		<select id="model" class="form-control">
		 <option value ="" selected disabled="disabled">Choose Your Model</option>
		</select>
</td>
 
<!-- <td rowspan="4">
 <label for="product">Exclusion rule</label>
 <select id="product" class="form-control">
		<option>Car</option>
		<option>Truck</option>
		<option>Bus</option>
		</select><br>
		<label for="product">Constraint</label>
		<select id="product" class="form-control">
		<option>Car</option>
		<option>Truck</option>
		<option>Bus</option>
		</select>
</td> -->
</tr>
<tr>	
<td>
 <label for="product">Engine</label>
		<select id="product" class="form-control">
		<option>Petrol</option>
		<option>diesel</option>
		</select>
</td>
</tr>
<tr>	
<td>
 <label for="product">Transmission</label>
		<select id="product" class="form-control">
		<option>Car</option>
		<option>Truck</option>
		<option>Bus</option>
		</select>
</td>

</tr>
<tr>
<td>
 <label for="product">Fule Tank Capacity</label>
		<select id="product" class="form-control">
		<option>Car</option>
		<option>Truck</option>
		<option>Bus</option>
		</select>
</td>
</tr>	
 

<tr>
 
<td style="text-align: right;" colspan="3">
<button type="button" class="btn btn-primary">Cancel</button>
<button type="button" class="btn btn-primary">Submit</button></td>
</tr>
</table>
</div>
<div class="col-sm-2"></div>
</div></div></div>
</body>

<%@include file="footer.jsp"%>