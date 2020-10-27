<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Housing Home</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
<style>
	.btn {
		padding: 2rem 1rem;
		width: 200px;
	}
	.row {
		margin: 100px auto;
	}
</style>
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="text-light">Student<span class="text-primary">Housing</span>App</h1>
	</header>
	<main class="text-center ">
		<div class="row w-50">
			<div class="col-6"><a href="/dorms" class="btn btn-lg btn-info">View Dorms</a></div>
			<div class="col-6"><a href="/students/pages/1" class="btn btn-lg btn-info">View Students</a></div>
		</div>
		<div class="row"></div>
		<div class="row w-75">
			<div class="col-4"><a href="/dorms/new" class="btn btn-lg btn-success">Add Dorm</a></div>
			<div class="col-4"><a href="/students/new" class="btn btn-lg btn-success">Add Student</a></div>
			<div class="col-4"><a href="/contacts/new" class="btn btn-lg btn-success">Add Contact Info</a></div>
		</div>
	</main>
</body>
</html>