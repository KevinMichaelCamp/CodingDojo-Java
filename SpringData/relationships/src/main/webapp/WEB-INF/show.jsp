<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://bootswatch.com/4/yeti/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<header class="bg-dark p-2 mb-5">
		<h1 class="inline-block">DMV Licenses</h1>
		<a href="/persons" class="btn btn-info">Home</a>
	</header>
	<main class="text-center">
		<h3><c:out value="${ person.firstName } + ' ' + ${ person.lastName }"/></h3>
		<div class="row text-left">
			<div class="col">
				<h6>License Number</h6>
			</div>
			<div class="col">
				<h6><c:out value ="${ person.license.number }"/></h6>
			</div>
		</div>
		<div class="row text-left">
			<div class="col">
				<h6>State</h6>
			</div>
			<div class="col">
				<h6><c:out value ="${ person.license.state }"/></h6>
			</div>
		</div>
		<div class="row text-left">
			<div class="col">
				<h6>Expiration Date</h6>
			</div>
			<div class="col">
				<h6><c:out value ="${ person.license.expirationDate }"/></h6>
			</div>
		</div>
	</main>
</body>
</html>