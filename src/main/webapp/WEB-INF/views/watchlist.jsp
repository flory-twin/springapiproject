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
<title>your_watchlist</title>
</head>
<body>


	<table class="table">
		<tr>
			<th>Name</th>
			<th>Image</th>
		</tr>
		<c:forEach var="m" items="${wR.findAll() }">

			<tr>
				<td><a>${m.name }</a></td>
				<td><img src="${ m.img }" /></td>
				<td><a href="/delete-watchlist?id=${ m.tmdbId }" class="btn btn-primary">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<a class="btn btn-primary" href="/">Back to Home</a>


</body>
</html>