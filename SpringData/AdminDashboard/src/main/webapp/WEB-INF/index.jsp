<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <header class="bg-dark text-light p-2 mb-5">
    	<h1>Login &amp; Registration</h1>
    </header>
    <main class="row p-2">
    	<div class="col">
    		<h2>Login</h2>
    		<form class="w-50" action="/login" method="POST">
    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    			<div class="form-group">
    			    <input class="form-control" type="email" name="email" placeholder="email">
    			</div>
    			<div class="form-group">
    			    <input class="form-control" type="password" name="password" placeholder="password">
    			</div>
    			<div class="form-group">
    			    <input class="btn btn-success" type="submit" value="Login">
    			</div>
    		</form>
    		<c:if test="${logoutMessage != null}">
	        	<p class="text-danger"><c:out value="${logoutMessage}"></c:out></p>
	    	</c:if>
	    	<c:if test="${errorMessage != null}">
	    		<p class="text-danger"><c:out value="${errorMessage}"></c:out></p>
		    </c:if>
    	</div>
    	<div class="col">
    		<h2>Register</h2>
    		<form:form class="ml-3" action="/registration" method="POST" modelAttribute="user">
    			<div class="form-group row">
    				<form:input class="form-control col-6" path="firstName" placeholder="first name"/>
    				<form:errors class="text-danger col-6" path="firstName"/>
    			</div>
    			<div class="form-group row">
    				<form:input class="form-control col-6" path="lastName" placeholder="last name"/>
    				<form:errors class="text-danger col-6" path="lastName"/>
    			</div>
    			<div class="form-group row">
    				<form:input class="form-control col-6" type="email" path="email" placeholder="email"/>
    				<form:errors class="text-danger col-6" path="email"/>
    			</div>
    			<div class="form-group row">
    				<form:input class="form-control col-6" type="password" path="password" placeholder="password"/>
    				<form:errors class="text-danger col-6" path="password"/>
    			</div>
    			<div class="form-group row">
    				<form:input class="form-control col-6" type="password" path="passwordConfirmation" placeholder="confirm password"/>
    				<form:errors class="text-danger col-6" path="passwordConfirmation"/>
    			</div>
    			<input class="btn btn-success reg_btn" type="submit" value="Register">
    		</form:form>
    	</div>
    </main>
</body>
</html>