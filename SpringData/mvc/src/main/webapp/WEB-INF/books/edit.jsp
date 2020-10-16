<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
</head>
<body class="text-center">
	<header class="bg-light p-2 mb-5">
		<h1>Edit Book Info</h1>
	</header>
	<form:form class="form w-50 m-auto" action="/books/${ book.id }" method="POST" modelAttribute="book">
		<input type="hidden" name="_method" value="put">
		<div class="form-group row">
			<form:label class="col-3" path="title">Title</form:label>
			<form:input class="form-control col-5" path="title" placeholder="${ book.title }"/>
			<form:errors class="col-4 text-danger" path="title"/>
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="description">Description</form:label>
			<form:textarea class="form-control col-5" path="description" placeholder="${ book.description }"/>
			<form:errors class="col-4 text-danger" path="description"/>
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="language">Language</form:label>
			<form:input class="form-control col-5" path="language" placeholder="${ book.language }"/>
			<form:errors class="col-4 text-danger" path="language"/>
			
		</div>
		<div class="form-group row">
			<form:label class="col-3" path="pages"># of Pages</form:label>
			<form:input class="form-control col-5" type="number" path="pages" placeholder="${ book.pages }"/>
			<form:errors class="col-4 text-danger" path="pages"/>
		</div>
		<input class="btn btn-success" type="submit" value="Update Book">
	</form:form>
</body>
</html>