
<%@include file="header.jsp"%>

<script>
$(document).ready(function () {

$('#productSel').change(function(){
	var productId= $(this).val();
	$.get("/api/option?productId="+productId,function(data,status){
		$('#model').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Model</option>");
		$.each(data,function(i,model){
			$('#model').append("<option value="+model.id+">"+model.displayName+"</option>")
		});
		});
});


$('#model').change(function(){
	var productId= $(this).val();
		$.get("/api/EngineType?EngineType=1",function(data,status){
			$('#Engine').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Engine</option>");
			$.each(data,function(i,engineType){
				$('#Engine').append("<option value="+engineType.id+">"+engineType.displayName+"</option>")
			});

			});
	});
	
$('#Engine').change(function(){
	var productId= $('#model').val();
		$.get("/api/TransmissionType?TransmissionType="+productId,function(data,status){
			$('#Transmission').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Transmission</option>");
			$.each(data,function(i,TransmissionType){
				$('#Transmission').append("<option value="+TransmissionType.id+">"+TransmissionType.displayName+"</option>")
				
			});
			});
	});
	
$('#Transmission').change(function(){
	var productId= $(this).val();
		$.get("/api/FuelCapacity?FuelCapacity=1",function(data,status){
			$('#FuelCapacity').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Fuel Tank Capacity</option>");
			$.each(data,function(i,FuelCapacity){
				$('#FuelCapacity').append("<option value="+FuelCapacity.id1+">"+FuelCapacity.displayName+"</option>")
				
			});
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
		<select id="productSel" class="form-control" >
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
 <label for="Engine">Engine</label>
		<select id="Engine" class="form-control">
		<option value ="" selected disabled="disabled">Choose Your Engine</option>
		
		</select>
</td>
</tr>
<tr>	
<td>
 <label for="Transmission">Transmission</label>
		<select id="Transmission" class="form-control">
		<option value ="" selected disabled="disabled">Choose Your Transmission</option>
		</select>
</td>

</tr>
<tr>
<td>
 <label for="FuelCapacity">Fule Tank Capacity</label>
		<select id="FuelCapacity" class="form-control">
		
		<option value ="" selected disabled="disabled">Choose Your Fuel Tank Capacity</option>
		
		
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
