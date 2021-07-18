<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Save Beer</title>


</head>
<body>
	<div>
		<div>
			<h2>Beer List</h2>
		</div>
	</div>
	
	
	
	<div>
		<h3>Save Beer</h3>
		<form:form action="saveBeer" modelAttribute="beers" method="POST">
			<form:hidden path="id"></form:hidden>
				<tbody>
					<tr>
						<td><label>Beer Name:</label></td>
						<td><form:input path="beerName"/></td>
					</tr>
					<br><br>
					<tr>
						<td><label>Brewery Name:</label></td>
						<td><form:input path="breweryName"/></td>
					</tr>
					<br><br>
					<tr>	
						<td><label>Beer Style:</label></td>
						<td><form:input path="beerStyle"/></td>
					</tr>
					<br><br>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save"/></td>
					</tr>
			
				</tbody>
			</form:form>
	</div>
</body>
</html>