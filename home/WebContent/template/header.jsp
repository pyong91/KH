<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 상단 조각을 보관하는 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈피</title>
</head>
<body>
	<!-- 
		홈페이지 영역 생성
		- 고정형 : 화면이 변해도 크기가 일정한 것
		- 반응형 : 화면이 변하면 크기가 변하는 것
	-->
	<div align="center">
	<table border="1" width="1000">
		<tbody>
			<tr>
				<th>
					<br>
					<!-- 더미 이미지(dummy image) 생성 -->
					<img src="http://placehold.it/200x40?text=logo"><br>
					<font size="4">홈피</font>
					<br><br>
				</th>
			</tr>
			<tr>
				<th align="left">
				<!-- 메뉴 불러오기 -->
				<jsp:include page="/template/menu.jsp"></jsp:include>
				</th>
			</tr>
			<tr height="300">
				<th valign="top">