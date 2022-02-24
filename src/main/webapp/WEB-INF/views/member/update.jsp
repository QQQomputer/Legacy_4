<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<h1>Member Update Page</h1>

<form action="./update" method="post">
	<div>
		ID<input type="text" readonly name="id" value="${dto.id}">
	</div>
	<div>
		PW<input type="password" disabled name="pw" value="${dto.pw}">
	</div>
	<div>
		NAME<input type="text" name="name" value="${dto.name}">
	</div>
	<div>
		PHONE<input type="text" name="phone" value="${dto.phone}">
	</div>
	<div>
		EMAIL<input type="text" name="email" value="${dto.email}">
	</div>
	<button type="submit">제출</button>
</form>


</body>
</html>