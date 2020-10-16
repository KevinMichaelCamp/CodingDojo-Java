<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Page</title>
<link rel="stylesheet" href="https://bootswatch.com/4/flatly/bootstrap.css">
</head>
<body>
	<div class="container mt-5">
		<h1>You have visited the counter page <c:out value="${count}"/> times</h1>
		<a class="btn btn-info" href="/">Go Back</a>
		<a class="btn btn-danger" href="/reset">Reset Counter</a>
		<a class="btn btn-success" href="/addtwo">Add Two Visits</a>
	</div>
</body>
</html>