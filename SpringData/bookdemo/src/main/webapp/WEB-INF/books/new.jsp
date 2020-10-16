<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Book</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
</head>
<body class="text-center">
	<header class="bg-light p-2 mb-5">
		<h1>Add Book to List</h1>
	</header>
	<form:form class="form w-50 m-auto" action="/books" method="POST" modelAttribute="book">
		<div class="form-group row">
			<form:label class="col-3" path="title">Title</form:label>
			<form:input class="form-control col-5" path="title"/>
			<form:errors class="col-4 text-danger" path="title"/>
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="description">Description</form:label>
			<form:textarea class="form-control col-5" path="description"/>
			<form:errors class="col-4 text-danger" path="description"/>
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="language">Language</form:label>
			<form:input class="form-control col-5" path="language"/>
			<form:errors class="col-4 text-danger" path="language"/>
			
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="pages"># of Pages</form:label>
			<form:input class="form-control col-5" type="number" path="pages"/>
			<form:errors class="col-4 text-danger" path="pages"/>
		</div>
		<input class="btn btn-success" type="submit" value="Add Book">
	</form:form>
</body>
</html>