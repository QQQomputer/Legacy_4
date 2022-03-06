<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<header class="header">
		<div class="nav_main">
			<ul class="a1">
				<li><a href="/s1">HOME</a></li>
				<li><a href="/s1/notice/list">Notice</a></li>
				<li><a href="/s1/qna/list">QnA</a></li>
				<li><a href="/s1/bankbook/list">Product</a></li>
			</ul>
		</div>
		<div class="nav_sub">
			<ul>
				<c:choose>
					<c:when test="${not empty member}">
						<li><a href="/s1/member/mypage">MyPage<span class="material-icons">manage_accounts</span></a></li>
						<li><a href="/s1/member/logout">로그아웃<span class="material-icons">logout</span></a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/s1/member/login">로그인<span class="material-icons">login</span></a></li>
						<li><a href="/s1/member/joinCheck">회원가입<span class="material-icons">person_add_alt_1</span></a></li>					
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</header>
	
