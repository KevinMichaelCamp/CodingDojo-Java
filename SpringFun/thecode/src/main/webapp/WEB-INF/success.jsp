<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Bushido Code</title>
<link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.css">
</head>
<body>
	<div class="container text-center mt-5">
		<h1>The Values of Bushido Code</h1>
		<ul class="list-group list-group-flush">
			<c:forEach items="${ideals}" var="ideal">
			<li class="list-group-item">${ideal}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>