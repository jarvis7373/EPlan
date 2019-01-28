
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
				<label for="model${features.id}"> ${features.displayName} </label>
			</div>
			<div class="col-sm-4">
				<select name="model${features.id}" id="model${features.id}">
					<option disabled="disabled" selected>choose your model</option>
					<option value="model1">model1</option>
					<option value="model2">model2</option>
					<option value="model3">model3</option>
					<option value="model4">model4</option>
					<option value="model5">model5</option>
				</select>
			</div>
			<div class="col-sm-4"></div>
		</div>
		</c:forEach>

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