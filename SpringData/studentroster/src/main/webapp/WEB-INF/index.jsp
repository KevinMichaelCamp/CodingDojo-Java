<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Roster Home</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="text-light">Student Roster</h1>
		<a href="/students/new" class="btn btn-success">Add Student</a>
		<a href="/contacts/new" class="btn btn-success">Add Contact Info</a>
		<a href="/students" class="btn btn-success">Student Index</a>
	</header>
</body>
</html>