<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info Page</title>
</head>
<body style="background-color:#ffffcc;">
<h1><c:out value="${oneD.name}"/> Location Ninjas</h1>
<table>
<thead>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</tr>
</thead>
<tbody>
<c:forEach items="${allN}" var="ninja">
<tr>
<td><c:out value="${ninja.firstName}"/></td>
<td><c:out value="${ninja.lastName}"/></td>
<td><c:out value="${ninja.age}"/></td>
</tr>
</c:forEach>
</tbody>
</table>
<br>
<br>
<a href="/">Go To Main Page</a>
</body>
</html>