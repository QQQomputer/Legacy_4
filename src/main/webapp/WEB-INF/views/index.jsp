<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="./template/header_css.jsp"></c:import>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons|Material+Icons+Outlined|Material+Icons+Two+Tone|Material+Icons+Round|Material+Icons+sharp"  rel="stylesheet">

	<style type="text/css">
		.my::after {
			content: "|"
		}
	</style>

</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	<h1>Index Page</h1>
	<h3>${member.name}님 환영합니다.</h3>
	<span class="material-icons-outlined">account_circle</span>
	<span class="material-icons-outlined">account_circle</span>
	<div>
		<c:if test="${not empty member}">
			<a href="./member/mypage?id=${member.id}">MyPage</a>
			<a href="./member/logout">LogOut</a>
		</c:if>
		<c:if test="${empty member}">
			<a href="./member/login">Login<span class="material-icons-outlined">login</span></a>
			<a href="./member/join">Join</a>
		</c:if>
	</div>
	
	
	
</body>
</html>