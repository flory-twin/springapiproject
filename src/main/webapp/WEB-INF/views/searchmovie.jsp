<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>searchpage</title>
</head>
<body>

	Search by:
	<form action="searching">
		<select id="searchTypeSelector" name="searchType"
			oninput="console.log('dammit')"
			onchange="
console.log('starting');
console.log('Text value:' + document.getElementById('searchTypeSelector').textContent);
if (document.getElementById('searchTypeSelector').selectedIndex == '0' ) {
	console.log('option 0');
	document.getElementById('nameTextBox').style.display = 'inline';
	document.getElementById('genreSelector').style.display = 'none'; 
} else if (document.getElementById('searchTypeSelector').selectedIndex == '2' ) {
	console.log('option 2');
	document.getElementById('nameTextBox').style.display = 'none';
	document.getElementById('genreSelector').style.display = 'inline';
} else {
	document.getElementById('nameTextBox').style.display = 'none';
	document.getElementById('genreSelector').style.display = 'none';
}">
			<option value="name">Name</option>
			<option value="year">Year</option>
			<option value="genre">Genre</option>
		</select> 
		<input id="nameTextBox" type="text" class="textbox" name="name"
			placeholder="Enter movie name"> <input
			type="number" class="number" name="year"
			placeholder="Enter movie release year" style="display: none">

		<select id="genreSelector" name="genre" style="display: none">
			<option value="28">Action</option>
			<option value="12">Adventure</option>

		</select> <input type="submit" value="Submit or DEATH!" class="btn btn-primary">
	</form>


	<table class="table">
		<tr>
			<th>Name</th>
			<th>Image</th>
		</tr>
		<c:forEach var="m" items="${response.getResults() }">

			<tr>
				<td>
					<a href="/details/movie?id=${m.id}">${m.title }</a>
				</td>
				<td>
					<img src="${ m.getImageUrl() }"/>
				</td>
			</tr>
		</c:forEach>
	</table>

	<!-- <select>
	<option value="Name">Name</option>
	<option value="Year">Year</option>
	<option value="Genre">Genre</option>
</select>

<script>
	Document.getElement
</script>
 -->

</body>
</html>