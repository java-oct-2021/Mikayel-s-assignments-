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
<h1 align="center">New Product</h1>
<form:form action="/newproducts" method="post" modelAttribute="newProd" align="center">
<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<p>
<form:label path="description">Description</form:label>
<form:errors path="description"/>
<form:input path="description"/>
</p>
<p>
<form:label path="price">Price</form:label>
<form:errors path="price"/>
<form:input path="price"/>
</p> 
<input type="submit" value="Create"/>
</form:form> 
<div align="center">
<!-- <a href="/products}">Show all the Products</a> -->
</div>
</body>
</html>