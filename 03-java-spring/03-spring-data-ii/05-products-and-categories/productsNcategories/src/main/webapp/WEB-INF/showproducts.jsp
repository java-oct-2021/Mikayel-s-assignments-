<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
</head>
<body style="background-color:#ffffcc;">

<h1><c:out value="${product.name}"></c:out></h1>
<c:out value="${product.description}"></c:out>
<c:out value="${product.price}"></c:out>


<hr>
<h2>Categories</h2>
<ul>
<c:forEach items="${allCats}" var="cats">
<li>
${cats.name}
</li>
</c:forEach>
</ul>

<form method="POST" action="/addCatToProd/${product.id}">
<select name="cats">
<c:forEach items="${notInP}" var="cat">
<option value="${cat.id}">${cat.name}</option>
</c:forEach>
</select>
<button>Add Category</button>
</form>
</body>
</html>