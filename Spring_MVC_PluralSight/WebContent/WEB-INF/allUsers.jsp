<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="Account" items="${accounts}">
<c:url var="editLink" value="/edit">
	<c:param name="accountNo" value="${ Account.accNo}"></c:param>
</c:url>
<c:url var="deleteLink" value="/delete">
	<c:param name="accountNo" value="${ Account.accNo}"></c:param>
</c:url>
  <tr>
  	<td>${Account.accNo}</td>
  	<td>${Account.accHoldername}</td>
  	<td><a href="${editLink} ">Edit</a></td>
  	<td><a href="${deleteLink} " >Delete</a></td>
  </tr><br>

</c:forEach>
</body>
</html>