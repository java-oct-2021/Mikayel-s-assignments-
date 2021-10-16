<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date page</title>
<link rel="stylesheet" href="/css/style.css"/>
<script src="js/main.js"></</script>
</head>
<body>
<script>datePop()</script>
<div class="blue">
<fmt:formatDate pattern="EEEE, dd, MMMM, YYYY" value="${showDate}"/>
</div>
</body>
</html>