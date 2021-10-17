<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method="POST">
<p> Your Name: <input type="text" name="name"> </p>
<p>Dojo Location: 
	<select name="location">
	<option value="USA">USA</option>
	<option value="Armenia">Armenia</option>
	<option value="Moon">Moon</option>
	</select>
</p>
<p>Favorite Program: 
	<select name="language">
	<option value="Java">Java</option>
	<option value="JS">JS</option>
	<option value="Not Python">Not Python</option>
	</select>
</p>
<div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here" name="comment" id="floatingTextarea" style="height: 100px"></textarea>
  <label for="floatingTextarea">Comment (optional)</label>
</div>
<p><button>Submit</button></p>
</form>
</body>
</html>