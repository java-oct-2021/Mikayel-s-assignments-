<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body style="background-color:#ffffcc;">
<h1 align="center">New Dojo</h1>
<form:form action="/newdojo" method="post" modelAttribute="newDojo" align="center">
<p>
<form:label path="name">Name: </form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p> 
<input class="btn btn-primary" type="submit" value="Submit"/>
</form:form> 
</body>
</html>