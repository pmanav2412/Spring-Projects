<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<a href="data">add</a><br>


<spring:message code="lbl.firstName"></spring:message> <pre> <h1> ${Account.firstname} </h1>  <br> 
<spring:message code="lbl.lastName"></spring:message> <pre>  <h1> ${Account.lastname} </h1>  <br> 
<spring:message code="lbl.DOB"></spring:message> <pre> <h1> ${Account.dob} </h1>  <br> 
<spring:message code="lbl.Number"></spring:message> <pre>  <h1> ${Account.number} </h1>  <br> 
<spring:message code="lbl.City"></spring:message> <pre> <h1> ${Account.city} </h1>  <br> 
<spring:message code="lbl.Country"></spring:message> <pre> <h1> ${Account.country} </h1>  <br> 
</body>
</html>