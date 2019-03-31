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
<h2><spring:message code="lbl.title"/></h2>

	<form:form method="post" action="seedata" modelAttribute="account">
		<spring:message code="lbl.firstName"></spring:message>
		<br>
		<form:input path="firstname" />
		<br>
		<spring:message code="lbl.lastName"></spring:message>
		<br>
		<form:input path="lastname" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>


</body>
</html>