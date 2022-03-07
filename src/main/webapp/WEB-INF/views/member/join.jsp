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
<h1>Member Join Page</h1>
    <form class="frm" action="./join" method="post">
        <fieldset>
            <legend>ID</legend>
            <input type="text" name="id">
        </fieldset>
        <fieldset>
            <legend>PASSWORD</legend>
            <input type="password" name="pw" placeholder="8글자 이상 12글자 이하로 작성">
            <div id="pwResult"></div>
        </fieldset>
        <fieldset>
            <legend>NAME</legend>
            <input type="text" name="name">
        </fieldset>
        <fieldset>
            <legend>PHONE</legend>
            <input type="text" name="phone">
        </fieldset>
        <fieldset>
            <legend>EMAIL</legend>
            <input type="text" name="email">
        </fieldset>
        <fieldset>
            <button type="submit">JOIN</button>
        </fieldset>

    </form>
</body>
</html>