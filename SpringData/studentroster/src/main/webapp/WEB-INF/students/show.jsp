<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="text-light">Student Info</h1>
		<a href="/students/new" class="btn btn-success">Add Student</a>
		<a href="/contacts/new" class="btn btn-success">Add Contact Info</a>
		<a href="/students" class="btn btn-success">Student Index</a>
	</header>
	<main class="text-left w-25 m-auto">
		<h2 class="text-center mb-5"><c:out value="${ student.firstName } ${ student.lastName }"/></h2>
		<div class="row">
			<div class="col">
				<h4>Address</h4>
			</div>
			<div class="col">
				<h4><c:out value="${ student.contact.address }"/></h4>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h4>City</h4>
			</div>
			<div class="col">
				<h4><c:out value="${ student.contact.city }"/></h4>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h4>State</h4>
			</div>
			<div class="col">
				<h4><c:out value="${ student.contact.state }"/></h4>
			</div>
		</div>
	</main>	
</body>
</html>