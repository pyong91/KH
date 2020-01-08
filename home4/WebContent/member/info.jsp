<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 회원 정보를 불러오는 코드
	// 1. session에서 id에 들어있는 데이터를 꺼낸다
	// 2. id를 주고 dao를 이용해 회원정보(MemberDto)를 꺼낸다
	// 3. 원하는 위치에 출력
	
	String id = (String)session.getAttribute("id");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.getInfo(id);
	String context = request.getContextPath();
%>







<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">

	<h2><%= dto.getId() %>님의 정보</h2>
	
	<table border="1" width="450">
		<tr>
			<th width="25%">아이디</th>
			<th><%=dto.getId() %></th>
		</tr>
		<tr>
			<th>이름</th>
			<th><%=dto.getName() %></th>
		</tr>
		<tr>
			<th>등급</th>
			<th><%=dto.getGrade() %></th>
		</tr>
		<tr>
			<th>포인트</th>
			<th><%=dto.getPoint() %> point</th>
		</tr>
		<tr>
			<th>전화번호</th>
			<th><%=dto.getPhone() %></th>
		</tr>
		<tr>
			<th>주소</th>
			<th>
			<%=dto.getAddress() %>
			</th>
		</tr>
		<tr>
			<th>가입일</th>
			<th><%=dto.getJoindateWithFormat() %></th>
		</tr>
		<tr>
			<th>최종로그인</th>
			<th><%=dto.getLast_loginWithFormat() %></th>
		</tr>
	</table>

<!-- 다른 기능으로 링크 -->
	<h4><a href="check_pw.jsp?go=/member/change_pw.jsp">비밀번호 변경</a></h4>
	<h4><a href="check_pw.jsp?go=/member/change_info.jsp">회원정보 수정</a></h4>
	<h4><a href="check_pw.jsp?go=/member/exit.do">회원 탈퇴</a></h4>
</div>



<jsp:include page="/template/footer.jsp"></jsp:include>