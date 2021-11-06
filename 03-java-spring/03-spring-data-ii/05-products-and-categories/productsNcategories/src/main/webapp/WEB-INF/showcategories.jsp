<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category Page</title>
</head>
<body style="background-color:#ffffcc;">
<h1><c:out value="${category.name}"/></h1>
<hr>
<h2>Products</h2>
<ul>
<c:forEach items="${category.products}" var="prod">
<li>${prod.name} | ${prod.description} | ${prod.price}
</c:forEach>
</ul>

<form method="POST" action="/addProdToCat/${category.id}">
<select name="prods">
<c:forEach items="${notInCat}" var="prod">
<option value="${prod.id}">${prod.name}</option>
</c:forEach>
</select>
<button>Add Product</button>
</form>
</body>
</html>