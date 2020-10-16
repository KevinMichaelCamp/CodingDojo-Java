<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.css">
</head>
<body>
	<header class="bg-light text-center p-2">
		<h1 class="bg-light">Dojo Survey Form</h1>
	</header>
	<div class="container text-center mt-5">
		<form class="form w-50 m-auto" action="/process" method="POST">
			<div class="form-group row">
				<div class="col-4">
					<label>Your Name:</label>
				</div>
				<div class="col-8">
					<input class="form-control" type="text" name="name">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-4">
					<label>Dojo Location:</label>
				</div>
				<div class="col-8">
					<select class="form-control" name="location">
						<option value="Burbank">Burbank</option>
						<option value="Dallas">Dallas</option>
						<option value="San Jose">San Jose</option>
					</select>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-4">
					<label>Favorite Language:</label>
				</div>
				<div class="col-8">
					<select class="form-control" name="language">
						<option value="Java">Java</option>
						<option value="Python">Python</option>
						<option value="Ruby">Ruby</option>
					</select>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-4">
					<label>Comment (optional):</label>
				</div>
				<div class="col-8">
					<textarea class="form-control" name="comment"></textarea>
				</div>
			</div>
			<input class="btn btn-success" type="submit" value="Submit">
		</form>
		<p class="text-danger mt-5"><c:out value="${ error }"/></p>
	</div>
</body>
</html>