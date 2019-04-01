<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<!--
.error{
 color:red; 
}
-->
</style>
</head>
<body>

<h2><spring:message code="lbl.title"/></h2>

	<form:form method="post" action="seedata" modelAttribute="Account">
		<spring:message code="lbl.firstName"></spring:message>
		<br>
		<form:input path="firstname" />
		<form:errors path="firstname"  class="error"/>
		<br>
		<spring:message code="lbl.lastName"></spring:message>
		<br>
		<form:input path="lastname" />
		<form:errors path="lastname"  class="error" />
		<br>
		<spring:message code="lbl.DOB"></spring:message>
		<br>
		<form:input path="dob" />
		<form:errors path="dob"  class="error" />
		<br>
		<spring:message code="lbl.Number"></spring:message>
		<br>
		<form:input path="number" />
		<form:errors path="number"  class="error" />
		<br>
		<spring:message code="lbl.City"></spring:message>
		<br>
		<form:input path="city" />
		<form:errors path="city"  class="error"/>
		<br>
		<spring:message code="lbl.Country"></spring:message>
		<br>
		<form:input path="country" />
		<form:errors path="country"  class="error" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>


</body>
</html>