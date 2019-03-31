<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>HTML Forms</h2>
<form:errors path="student1.*"></form:errors>
<form action="/Spring_MVC/login" method="post">
  First name:<br>
  <input type="text" name="name" value="Manav">
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="Patel">
  <br><br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>