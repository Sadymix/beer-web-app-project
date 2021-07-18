<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>Beers List</title>
<link type="text/css" rel="stylesheet" 
			href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	<div>
		<div>
			<h2>Beers List</h2>
		</div>
	</div>
	<div>
		<div>
			<input type="button" value="Add Beer"
			onClick="window.location.href='showAddBeer'; return false;"/>
			<br><br>
			<table>
				<tr>
					<th>Beer Name</th>
					<th>Brewery Name</th>
					<th>Beer Style</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempBeer" items="${beers}">
				
				<c:url var="updateLink" value="/beer/showFormForBeerUpdate">
					<c:param name="beerId" value="${tempBeer.id}"></c:param>
				</c:url>
				<c:url var="deleteLink" value="/beer/delete">
					<c:param name="beerId" value="${tempBeer.id}"></c:param>
				</c:url>
					<tr>
						<td> ${tempBeer.beerName} </td>
						<td> ${tempBeer.breweryName} </td>
						<td> ${tempBeer.beerStyle} </td>
						<td><a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="return confirm('Are you sure you want to delete this ${tempBeer.beerName} beer')">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
						
			</table>
		</div>
	</div>
</body>
</html>