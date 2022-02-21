<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>add page</h1>
	
<!-- 	<form action="" method="post">
		<input type="text" name="id">url?id=아이유
		<input type="password" placeholder="example@gmail.com">
		<input type="button" value="눌러">
		<input type="checkbox">
		<input type="color">
		<input type="date" readonly> 아이디 입력후 비번만 입력할때 아이디 못고치게, 서버전송가능
		<input type="datetime-local" disabled>서버전송 불가
		<input type="datetime">
		<input type="email">
		<input type="image">
		<input type="submit">
		<input type="reset" value="초기화화화">
		<input type="search">
		<input type="file">
		<input type="number">
		<input type="tel">
		<input type="hidden">
	</form> -->
	<form action="./add" method="POST">
		BookName <input type="text" name="bookName">
		BookRate<input type="text" name="bookRate">
		BookContents <textarea name="bookContents" rows="10" cols=""></textarea>
		
		BookSale 
		<div>
			판매<input type="radio" name="bookSale" value="1">
			판매중지<input type="radio" name="bookSale" value="0">
		</div>	
		
		<div>
			CheckBox
			<input type="checkbox" name="ch">
			<input type="checkbox" name="ch">
			<input type="checkbox" name="ch">
			<input type="checkbox" name="ch">
		</div>
	
		<input type="submit" value="ADD">
		<button type="button">ADD</button>
	</form>
	


</body>
</html>