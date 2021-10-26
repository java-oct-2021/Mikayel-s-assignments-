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
<body>

<table>
<thead>
<tr>
	<td>Name</td>
	<td>Creator</td>
	<td>Version</td>
	<td>Action</td>
</tr>
</thead>
<tbody>

<c:forEach items="${allLanguages}" var="l">

<tr>
<td><a href="/show/${l.id}">${l.name}</a></td>
<td>${l.creator}</td>
<td>${l.currentVersion}</td>
<td>
<a href="/edit/${l.id}">Edit</a> | <a href="/delete/${l.id}">Delete</a>
</td>

</c:forEach>

</tbody>
</table>

<h2>Create new language</h2>

<form:form action="/" method="POST" modelAttribute="language">

<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>

<p>
<form:label path="creator">Creator</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>
</p>

<p>
<form:label path="currentVersion">Current Version</form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>

<button>Submit</button>

</form:form>
</body>
</html>