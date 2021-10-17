<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted Info</h1>
<p>Name: <a href="/result/info"><c:out value="${n}"/></a></p>
<p>Dojo Location: <c:out value="${l}"/></p>
<p>Favorite Language: <c:out value="${lan}"/></p>
<p>Comment: <c:out value="${c}"/></p>



<form action="/">
    <input type="submit" value="Go Back" />
</form>
</body>
</html>