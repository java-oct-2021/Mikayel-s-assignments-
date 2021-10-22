<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">What is the code ?</h1>
<p align="center">${error}</p>
<form action="/dashboard" method="POST" >
<p align="center"><input type="text" name="code"> </p>
<p align="center"><button>Try code</button></p>
</form>
</body>
</html>