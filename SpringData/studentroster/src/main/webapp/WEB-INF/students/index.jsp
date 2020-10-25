<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Index</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="/js/show.js"></script>
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="text-light">All Students</h1>
		<a href="/students/new" class="btn btn-success">Add Student</a>
		<a href="/contacts/new" class="btn btn-success">Add Contact Info</a>
	</header>
	<main class="text-center">
		<table class="table table-striped w-50 m-auto">
			<thead>
				<tr>
					<th>Name</th>
					<th>Age</th>
					<th>Address</th>
					<th>City</th>
					<th>State</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ students }" var="student">
				<tr data-href="/students/${ student.id }">
					<td>${ student.firstName } ${ student.lastName }</td>
					<td>${ student.age }</td>
					<td>${ student.contact.address }</td>
					<td>${ student.contact.city }</td>
					<td>${ student.contact.state }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
</body>
</html>