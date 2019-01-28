
<%@include file="header.jsp"%>
<link rel="stylesheet" href="eplan_style.css">

<button class="tablink" onclick="openPage('Master', this, 'white')">Master</button>
<button class="tablink" onclick="openPage('Home', this, 'white')"
	id="defaultOpen">Home</button>
<button class="tablink" onclick="openPage('Guide', this, 'white')">Guide</button>

<div id="Master" class="tabcontent"></div>

<div id="Home" class="tabcontent">
	<form action="…" method="post" id="salesform">
		<c:forEach items="${features}" var="features">
		<div class="row">
			<div class="col-sm-3 " style="text-align: right; padding: 10px 57px;">
				<label for="${features.internalName}"> ${features.displayName} </label>
			</div>
			<div class="col-sm-4">
				<select name="${features.internalName}" id="${features.internalName}" class="features">
					<option disabled="disabled" selected>choose your </option>
					 
				</select>
			</div>
			<div class="col-sm-4"></div>
		</div>
		</c:forEach>
		
		<script>
$(document).ready(function () {
	
	

/*$('#productSel').change(function(){
	var productId= $(this).val();
	$.get("/api/option?productId="+productId,function(data,status){
		$('#model').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Model</option>");
		$.each(data,function(i,model){
			$('#model').append("<option value="+model.id+">"+model.displayName+"</option>")
		});
		});
});*/

$('#MODEL').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Model</option>");
$('#MODEL').append("<option value='1'>CAR</option>");

$('#MODEL').change(function(){
	var productId= $(this).val();
		$.get("/api/EngineType?EngineType=1",function(data,status){
			$('#ENGINE').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Engine</option>");
			$.each(data,function(i,engineType){
				$('#ENGINE').append("<option value="+engineType.id+">"+engineType.displayName+"</option>")
			});

			});
	});
	
$('#ENGINE').change(function(){
	var productId= $('#model').val();
		$.get("/api/TransmissionType?TransmissionType="+productId,function(data,status){
			$('#TRANSMISSION').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Transmission</option>");
			$.each(data,function(i,TransmissionType){
				$('#TRANSMISSION').append("<option value="+TransmissionType.id+">"+TransmissionType.displayName+"</option>")
				
			});
			});
	});
	
$('#TRANSMISSION').change(function(){
	var productId= $(this).val();
		$.get("/api/FuelCapacity?FuelCapacity=1",function(data,status){
			$('#FULE_TANK_CAPACITY').empty().append(" <option value ='' selected disabled='disabled'>Choose Your Fuel Tank Capacity</option>");
			$.each(data,function(i,FuelCapacity){
				$('#FULE_TANK_CAPACITY').append("<option value="+FuelCapacity.id1+">"+FuelCapacity.displayName+"</option>")
				
			});
			});
	});
});
</script>

		<!-- <div class="row">

			<div class="col-sm-3 " style="text-align: right; padding: 10px 57px;">
				<label for="model"> Model </label>
			</div>
			<div class="col-sm-4">
				<select name="model" id="model">
					<option disabled="disabled" selected>choose your model</option>
					<option value="model1">model1</option>
					<option value="model2">model2</option>
					<option value="model3">model3</option>
					<option value="model4">model4</option>
					<option value="model5">model5</option>
				</select>
			</div>
			<div class="col-sm-4"></div>
		</div> -->

	</form>
</div>



<div id="Guide" class="tabcontent"></div>

<script>
	function openPage(pageName, elmnt, color) {
		var i, tabcontent, tablinks;
		tabcontent = document.getElementsByClassName("tabcontent");
		for (i = 0; i < tabcontent.length; i++) {
			tabcontent[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablink");
		for (i = 0; i < tablinks.length; i++) {
			tablinks[i].style.backgroundColor = "";
		}
		document.getElementById(pageName).style.display = "block";
		elmnt.style.backgroundColor = color;
	}

	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();
</script>

<%@include file="footer.jsp"%>