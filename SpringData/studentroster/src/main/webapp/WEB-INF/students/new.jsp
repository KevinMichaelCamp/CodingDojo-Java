<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Student</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="text-light">Add a New Student</h1>
		<a href="/contacts/new" class="btn btn-success">Add Contact Info</a>
		<a href="/students" class="btn btn-success">Student Index</a>
	</header>
	<main class="text-center">
		<h3 class="mb-5">Student Information</h3>
		<form:form class="form w-50 m-auto" action="/students" method="POST" modelAttribute="student">
			<div class="form-group row">
				<form:label class="col-3" path="firstName">First Name</form:label>
				<form:input class="form-control col-5" path="firstName"/>
				<form:errors class="col-4 text-danger" path="firstName"/>
			</div>
			<div class="form-group row">
				<form:label class="col-3" path="lastName">Last Name</form:label>
				<form:input class="form-control col-5" path="lastName"/>
				<form:errors class="col-4 text-danger" path="lastName"/>
			</div>
			<div class="form-group row">
				<form:label class="col-3" path="age">Age</form:label>
				<form:input class="form-control col-5" type="number" min="1" max="120" path="age"/>
				<form:errors class="col-4 text-danger" path="age"/>
			</div>
			<input type="submit" class="btn btn-info mt-5" value="Add Student">
		</form:form>
	</main>	
</body>
</html>