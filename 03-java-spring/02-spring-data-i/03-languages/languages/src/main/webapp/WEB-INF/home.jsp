<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body style="background-color:Gainsboro;">

<table>
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
</tr>
<tbody>
<c:forEach var="lang" items="${allLangs}">
<tr>
<td><a href="/languages/${lang.id}"> ${lang.name}</a></td>
<td>${lang.creator}</td>
<td>${lang.currentVersion}</td>
<td><a href="/language/edit/${lang.id}">Edit</a></td>
<td><a href="/language/delete/${lang.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<form:form action="/languages" method="POST" modelAttribute="llcoolj">
<p align="center">
<form:label path="name">Name:</form:label>
<form:errors type="text" path="name"/>
<form:input type="text" path="name"/>
</p>
<p align="center">
<form:label path="creator">Creator:</form:label>
<form:errors type="text" path="creator"/>
<form:input type="text" path="creator"/>
</p>
<p align="center">
<form:label path="currentVersion">Version:</form:label>
<form:errors type="text" path="currentVersion"/>
<form:input type="text" path="currentVersion"/>
</p>
<p align="center"><button>Submit</button></p>
</form:form>

</body>
</html>