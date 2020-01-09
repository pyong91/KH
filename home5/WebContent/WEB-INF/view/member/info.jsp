<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/template/header.jsp"></jsp:include>


<div align="center">

	<h2>${dto.id}님의 정보</h2>
	
	<table border="1" width="450">
		<tr>
			<th width="25%">아이디</th>
			<th>${dto.id}</th>
		</tr>
		<tr>
			<th>이름</th>
			<th>${dto.name}</th>
		</tr>
		<tr>
			<th>등급</th>
			<th>${dto.grade}</th>
		</tr>
		<tr>
			<th>포인트</th>
			<th>${dto.point} point</th>
		</tr>
		<tr>
			<th>전화번호</th>
			<th>${dto.phone}</th>
		</tr>
		<tr>
			<th>주소</th>
			<th>
			${dto.address}
			</th>
		</tr>
		<tr>
			<th>가입일</th>
			<th>${dto.getJoindateWithFormat() }</th>
		</tr>
		<tr>
			<th>최종로그인</th>
			<th>${dto.getLast_loginWithFormat() }</th>
		</tr>
	</table>

<!-- 다른 기능으로 링크 -->
	<h4><a href="check_pw.jsp?go=/member/change_pw.jsp">비밀번호 변경</a></h4>
	<h4><a href="check_pw.jsp?go=/member/change_info.jsp">회원정보 수정</a></h4>
	<h4><a href="check_pw.jsp?go=/member/exit.do">회원 탈퇴</a></h4>
</div>



<jsp:include page="/template/footer.jsp"></jsp:include>