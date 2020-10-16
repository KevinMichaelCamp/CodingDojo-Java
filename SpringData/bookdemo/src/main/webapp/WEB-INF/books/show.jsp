<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
<style>
	form {
		display: inline-block;
	}
</style>
</head>
<body class="text-center">
	<header class="bg-light p-2 mb-5">
		<h1><c:out value="${ book.title }"/></h1>
	</header>
	<div class="row w-50 m-auto">
		<div class="col text-left">
			<h3>Description:</h3>
		</div>
		<div class="col text-left">
			<h3><c:out value="${ book.description }"/></h3>
		</div>
	</div>
	<div class="row w-50 m-auto">
		<div class="col text-left">
			<h3>Language:</h3>
		</div>
		<div class="col text-left">
			<h3><c:out value="${ book.language }"/></h3>
		</div>
	</div>
	<div class="row w-50 m-auto">
		<div class="col text-left">
			<h3>Number of Pages:</h3>
		</div>
		<div class="col text-left">
			<h3><c:out value="${ book.pages }"/></h3>
		</div>
	</div>
	<a href="/books/edit/${ book.id }" class="btn btn-warning mt-5 mr-5">Edit Book</a>
	<form action="/books/${ book.id }" method="POST">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" class="btn btn-danger mt-5" value="Delete Book">
	</form>
</body>
</html>