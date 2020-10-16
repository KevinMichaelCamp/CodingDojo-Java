<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://bootswatch.com/4/superhero/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header class="bg-light text-primary p-3">
		<h1>Your Gold: <span><c:out value="${ gold }"/></span><a class="btn btn-danger ml-5" href="/reset">Reset Game</a></h1>
	</header>
	<div class="game mt-5">
		<div class="card">
			<h2>Farm</h2>
			<p>(earns 10-20 gold)</p>
			<form action="/process" method="POST">
				<input type="hidden" name="location" value="farm">
				<input class="btn btn-primary" type="submit" value="Find Gold">
			</form>
		</div>
		<div class="card">
			<h2>Cave</h2>
			<p>(earns 5-10 gold)</p>
			<form action="/process" method="POST">
				<input type="hidden" name="location" value="cave">
				<input class="btn btn-primary" type="submit" value="Find Gold">
			</form>
		</div>
		<div class="card">
			<h2>House</h2>
			<p>(earns 2-5 gold)</p>
			<form action="/process" method="POST">
				<input type="hidden" name="location" value="house">
				<input class="btn btn-primary" type="submit" value="Find Gold">
			</form>
		</div>
		<div class="card">
			<h2>Casino</h2>
			<p>(earns/takes 0-50 gold)</p>
			<form action="/process" method="POST">
				<input type="hidden" name="location" value="casino">
				<input class="btn btn-primary" type="submit" value="Find Gold">
			</form>
		</div>
	</div>
	<p class="ml-3">Activities</p>
	<div class="activities">
		<c:forEach items="${ activities }" var="activity">
			<p>${ activity }</p>
		</c:forEach>
	</div>
</body>
</html>