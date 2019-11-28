<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
홈페이지 메뉴를 구현 
- 주의 : 경로는 절대경로를 사용해야 한다(불려가서 실행되므로)
- 명령 : request.getContextPath() 를 이용하면 자동으로 주소 첫부분을 구해온다
-->

<%
//	로그인 상태 판정
	String context = request.getContextPath();
	String id = (String)session.getAttribute("id");
	boolean login = id == null;
	
//	관리자 판정
	String grade = (String)session.getAttribute("grade");
	boolean admin = grade != null && grade.equals("관리자");
%>

<a href="<%= context %>">홈으로</a>
<% if(login) { %>
<a href="<%= context %>/member/regist.jsp">회원가입</a>
<a href="<%= context %>/member/login.jsp">로그인</a>
<%} else {%>
<a href="#">회원정보</a>
<a href="<%= context %>/member/logout.do">로그아웃</a>
<%} %>
<a href="#">게시판</a>

<% if(admin) {%>
<a href="#">회원찾기</a>
<%} %>

