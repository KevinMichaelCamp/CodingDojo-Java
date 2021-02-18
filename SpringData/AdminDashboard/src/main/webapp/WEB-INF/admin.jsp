<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <header class="bg-dark text-light p-2 mb-5">
    	<h1>Admin Dashboard</h1>
    	<form id="logoutForm" method="POST" action="/logout">
    		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
    		<input type="submit" class="btn btn-success" value="Logout">
  		</form>
    </header>
    <main  class="pl-5">
    	<h1 class="mb-5">Welcome, <c:out value="${ currentUser.firstName }"/>!</h1>
    	<table class="table table-striped w-75 m-auto">
    		<thead>
    			<tr>
    				<th>Name</th>
    				<th>Email</th>
    				<th>Action</th>
    			</tr>
    		</thead>
    		<tbody>
    			<c:forEach items="${ allUsers }" var="user">
    			<tr>
    				<td><c:out value="${ user.firstName } ${ user.lastName }"/></td>
    				<td><c:out value="${ user.email }"/></td>
    				<td>actions</td>
    			</tr>
    			</c:forEach>
    		</tbody>
    	</table>
    </main>
</body>
</html>