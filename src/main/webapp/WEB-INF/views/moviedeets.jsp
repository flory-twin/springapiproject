<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>${ details.title }</title>
</head>
<body>
	<!-- MUST receive a passed parameter (TMDBMovieDetailResponse details) to operate correctly. -->
	<table class="table">
		<tr>
			<td>Title</td>
			<td>${ details.title }</td>
		</tr>
		<tr>
			<td>Released</td>
			<td>${ details.releaseDate }</td>
		</tr>
		<tr>
			<td>Genres</td>
			<td>
				<c:forEach var="gen" items="${ details.genres }">
					${ gen.name } <br/>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>Production Companies</td>
			<td>
				<c:forEach var="pr" items="${ details.productionCompany }">
					${ pr.name }, ${ pr.originCountry } <br/>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>Naughty Bits!!!!</td>
			<td> ${ details.adult }</td>
		</tr>
		<tr>
			<td>Summary</td>
			<td>${ details.overview }</td>
		</tr>
	</table>
	
	
	<a href="/searchmovie" class="btn btn-primary">Back to Search</a>
	<form action="/add-watchlist">
		<input type="hidden" name="id" value="${ details.getId() }"/>
		<input class="btn btn-primary" type="submit" value="Add Movie To Watchlist"/>
	</form>
</body>
</html>