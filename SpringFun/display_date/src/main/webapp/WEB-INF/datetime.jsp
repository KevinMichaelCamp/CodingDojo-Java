<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time | Date Display</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body onload="alertPage('<c:out value="${dt}"/>')">
	<h1 class=<c:out value="${ dt }"/>>
		<c:out value="${ dtFormat }"/>
	</h1>
	<script src="js/app.js"></script>
</body>

</html>