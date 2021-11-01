<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body style="background-color:#ffffcc;">
<h1 align="center">New Ninja</h1>

<form:form action="/newninja/create" method="post" modelAttribute="newNinja" align="center">
<p>
<form:label path="dojo">Name: </form:label>
<form:errors path="dojo"/>
<form:select path="dojo">
<c:forEach items="${allDojos}" var="dojo">
<option value="${dojo.id}">${dojo.name}</option>
</c:forEach>
</form:select>
</p>
<p>
<form:label path="firstName">First Name: </form:label>
<form:errors path="firstName"/>
<form:input path="firstName"/>
</p> 
<p>
<form:label path="lastName">Last Name: </form:label>
<form:errors path="lastName"/>
<form:input path="lastName"/>
</p> 
<p>
<form:label path="age">Age: </form:label>
<form:errors path="age"/>
<form:input path="age"/>
</p> 
<input type="submit" value="Submit"/>
</form:form>

</body>
</html>