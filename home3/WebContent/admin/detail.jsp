<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//회원 정보를 불러오는 코드
	//1. parameter에 있는 id를 꺼낸다(정보를 볼 대상의 ID)
	//2. id를 주고 dao를 이용하여 회원정보(MemberDto)를 꺼낸다
	//3. 원하는 위치에 출력한다.
	
	String id = request.getParameter("id");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.getInfo(id);
%>

<jsp:include page="/template/header.jsp"></jsp:include>
<div align="center">
	
	<h2><%=dto.getId()%> 님의 정보</h2>
	
	<table border="1" width="450">
		<tr>
			<th width="25%">아이디</th>
			<td><%=dto.getId()%></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><%=dto.getName()%></td>
		</tr>
		<tr>
			<th>등급</th>
			<td><%=dto.getGrade()%></td>
		</tr>
		<tr>
			<th>포인트</th>
			<td><%=dto.getPoint()%> point</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%=dto.getPhone()%></td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
				<%=dto.getAddress()%>
			</td>
		</tr>
		<tr>
			<th>가입일</th>
			<td><%=dto.getJoindateWithFormat()%></td>
		</tr>
		<tr>
			<th>최종로그인</th>
			<td><%=dto.getLast_loginWithFormat()%></td>
		</tr>
	</table>
	
	<!-- 다른 기능으로 링크 -->
	<h4><a href="spare.do?id=<%=dto.getId()%>">비밀번호 변경</a></h4>
	<h4><a href="input.jsp?id=<%=dto.getId()%>">회원정보 수정</a></h4>
	<h4><a href="out.do?id=<%=dto.getId()%>">회원 탈퇴</a></h4>	
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>