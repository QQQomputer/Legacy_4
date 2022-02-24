<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
<style>



</style>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<h1>Notice Update Page</h1>

<form action="./update" method="post">
	<input type="text" hidden readonly name="num" value="${dto.num}">
	Title<input type="text" name="title" value="${dto.title}">
	Contents<input type="text" name="contents" value="${dto.contents}">
	<button type="submit">제출</button>
</form>

</body>
</html>