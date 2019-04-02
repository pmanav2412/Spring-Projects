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



	<form:form method="post" action="saveData" modelAttribute="Account">
		Account number :
		<br>
		<form:input path="accNo" />
		<form:errors path="accNo" class="error" />
		<br>
		Account holder Name :
		<br>
		<form:input path="accHoldername" />
		<form:errors path="accHoldername" class="error" />
		<br>
		Account Balance :
		<br>
		<form:input path="balance" />
		<form:errors path="balance" class="error" />
		<br>
		Account Type :
		<br>
		<form:input path="accountType" />
		<form:errors path="accountType" class="error" />
		<br>
		Date Of birth :
		<br>
		<form:input path="dateOfBirth" />
		<form:errors path="dateOfBirth" class="error" />
		<br>
		PS Code :
		<br>
		<form:input path="PsCode" />
		<form:errors path="PsCode" class="error" />
		<br>
		<br>
		<input type="submit" value="Save Account">
	</form:form>



</body>
</html>