<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Display Date</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/date.css">
	<script type="text/javascript" src="/js/date.js"></script>
</head>

<body>
	<div class="jumbotron">
		<h1 class="display-4"><c:out value="${date}"></c:out></h1>
	</div>
	<a href="/"><button class="btn btn-info">Go Back</button></a>
</body>

</html>