<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  				<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  				<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  				<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

<!-- JSTL tag for linking -->
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>

<h3>CRM-WEB Application</h3>

<div class="container">
  <form:form action="saveCustomer" method="post" modelAttribute="customer">
  <form:hidden path="id" />
  
    <label for="fname">First Name</label></br>
    <form:input path="firstname" /></br>

    <label for="password">Password</label></br>
    <form:password path="password" /></br>
    

    <label for="email">Email</label></br>
    <form:input path="email" /> </br>
   

    <form:button>Submit</form:button>
  </form:form>
</div>

</body>
</html>