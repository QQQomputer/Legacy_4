<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice List Page</h1>
	<table>
		<tr>
			<th>Num</th><th>Title</th><th>Writer</th><th>Date</th><th>Hit</th>
		</tr>
		<c:forEach items="${list}" var="notice">
		<tr>
			<td>${notice.num}</a></td>
			<td>${notice.title}</td>
			<td>${notice.writer}</td>
			<td>${notice.date}</td>
			<td>${notice.hit}</td>
		</tr>
		</c:forEach>	
	</table>
	
	<a href="./add">Add</a>
</body>
</html>