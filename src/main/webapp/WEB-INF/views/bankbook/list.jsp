<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../resources/css/table.css" rel="styleSheet"/>
<link href="../resources/css/list.css" rel="styleSheet"/>
</head>
<body>
<!-- bookName, bookRate, bookSale -->
	<div class="table-container">
		<h1 class="title">BankBook List Page</h1>
		<!-- 검색 창 -->
		<div>
			<form action="./list" method="get">			
				<fieldset>
				<select name="kind">
					<option value="col1">제목</option>
				 	<option value="col2">본문</option>
				 	<option value="col3">작성자</option>
				</select>
					<input type="text" name="search" value="${pager.search}"> 
					<!-- 파라미터 = name -->		
					<button type="submit">검색</button>			
				</fieldset>
			</form>


		</div>

		<table class="table-basic">
			<tr>
				<th>상품번호</th><th>상품명</th><th>이자율</th><th>판매</th>
			</tr>
			<c:forEach items="${list}" var="book">
			<tr>
				<td>${book.bookNumber}</td>
				<td><a href="./detail?bookNumber=${book.bookNumber}">${book.bookName}</a></td>
				<td>${book.bookRate}</td>
				<td>${book.bookSale}</td>
			</tr>
			
			</c:forEach>	
		</table>
		
		
		<div>
			<c:if test="${pager.pre}">
				<a href="./list?page=${pager.startNum-1}">PREVIEW</a>
			</c:if>
		
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" step="1" var="i">
				<a href="./list?page=${i}&kind=${page.kind}&search=${pager.search}">${i}</a>
			</c:forEach>
			
			<c:if test="${pager.next}">
				<a href="./list?page=${pager.lastNum+1}">Next</a>
			</c:if>
		</div>
	
	
		<a href="./add">Add</a>
	</div>
</body>
</html>