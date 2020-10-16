<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
<link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.css">
</head>
<body>
	<div class="container text-center mt-5">
		<h1>What is the code?</h1>
		<p class="text-danger"><c:out value="${ error }" /></p>
		<form class="form w-50 m-auto" action="/process" method="POST">
			<input class="form-control" type="text" name="code">
			<input class="form-control btn btn-success mt-2" type="submit" value="Try Code">
		</form>
	</div>
</body>
</html>