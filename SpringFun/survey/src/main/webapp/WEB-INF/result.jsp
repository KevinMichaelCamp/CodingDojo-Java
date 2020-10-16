<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.css">
<style>
	h3 {
		color: black;
	}
</style>
</head>
<body>
	<header class="bg-light text-center p-2">
		<h1 class="bg-light">Submitted Info:</h1>
	</header>
	<div class="container mt-5">
		<div class="row">
			<div class="col">
				<h3>Name:</h3>
			</div>
			<div class="col">
				<h3><c:out value="${ user.name }"/></h3>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h3>Dojo Location:</h3>
			</div>
			<div class="col">
				<h3><c:out value="${ user.location }"/></h3>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h3>Favorite Langauge:</h3>
			</div>
			<div class="col">
				<h3><c:out value="${ user.langauge }"/></h3>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h3>Comment:</h3>
			</div>
			<div class="col">
				<h3><c:out value="${ user.comment }"/></h3>
			</div>
		</div>
		<a href="/" class="btn btn-success">Go Back</a>
	</div>
</body>
</html>