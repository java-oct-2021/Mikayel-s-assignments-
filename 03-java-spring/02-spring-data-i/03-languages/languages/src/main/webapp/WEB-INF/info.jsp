<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body style="background-color:Gainsboro;">
<h1>Info</h1>
<p><c:out value="${oneLang.name}"></c:out>
<p><c:out value="${oneLang.creator}"></c:out>
<p><c:out value="${oneLang.currentVersion}"></c:out>
<p><a href="/language/edit/${oneLang.id}">Edit</a>
<p><a href="/language/delete/${oneLang.id}">Delete</a>
</body>
</html>