<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page pageEncoding="utf-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<P>The time on the server is ${serverTime}.</P>
	<a href="sub1">sub 1</a><br>
	<a href="sub2?irum=tommy">sub 2 : tommy</a><br>
	<a href="sub2?irum=oscar">sub 2 : oscar</a><br>
</body>
</html>