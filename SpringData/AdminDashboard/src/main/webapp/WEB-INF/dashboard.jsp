<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard Page</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <header class="bg-dark text-light p-2 mb-5">
    	<h1>User Dashboard</h1>
    	<form id="logoutForm" method="POST" action="/logout">
    		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
    		<input type="submit" class="btn btn-success" value="Logout">
  		</form>
    </header>
    <main  class="pl-5">
    	<h1>Welcome, <c:out value="${ currentUser.firstName }"/>!</h1>
    	<div id="details">
    		<div class="row">
    			<h4 class="col">First Name:</h4>
    			<h4 class="col"><c:out value="${ currentUser.firstName }"/></h4>
    		</div>
    		<div class="row">
    			<h4 class="col">Last Name:</h4>
    			<h4 class="col"><c:out value="${ currentUser.lastName }"/></h4>
    		</div>
    		<div class="row">
    			<h4 class="col">Email:</h4>
    			<h4 class="col"><c:out value="${ currentUser.email }"/></h4>
    		</div>
    		<div class="row">
    			<h4 class="col">Sign-up Date:</h4>
    			<h4 class="col"><fmt:formatDate value="${ currentUser.createdAt }" type="date"/></h4>
    		</div>
    	</div>
    </main>
</body>
</html>