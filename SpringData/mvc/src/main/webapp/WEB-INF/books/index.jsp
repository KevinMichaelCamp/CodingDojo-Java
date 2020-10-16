<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Index</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
<style>
	a {
		color: black;
	}
	td > a {
		display: block;	
	}
</style>
</head>
<body class="text-center">
	<header class="bg-light p-2 mb-5">
		<h1>All Books</h1>
	</header>
	<table class="table table-borderless w-50 m-auto">
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th># of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ books }" var="book">
			<tr>
				<td><a href="/books/${ book.id }">${ book.title }</a></td>
				<td><a href="/books/${ book.id }">${ book.description }</a></td>
				<td><a href="/books/${ book.id }">${ book.language }</a></td>
				<td><a href="/books/${ book.id }">${ book.pages }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/books/new" class="btn btn-primary mt-5">Add New Book</a>
</body>
</html>