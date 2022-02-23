<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>My Page</h1>
<hr>
<div>
<h3>이름 : ${dto.name}</h3>
<h3>ID : ${dto.id}</h3>
<h3>PW : ${dto.pw}</h3>
<h3>PHONE : ${dto.phone}</h3>
<h3>EMAIL : ${dto.email}</h3>
</div>


</body>
</html>