<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:#ffffcc;">
<h1 align="center">New Category</h1>
<form:form action="/newCategory" method="post" modelAttribute="newCategory" align="center">
<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<input type="submit" value="Create"/>
</form:form> 
</body>
</html>