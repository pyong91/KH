<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	MemberDao dao = new MemberDao();
	MemberDto dto = new MemberDto();
	String id = (String)session.getAttribute("id");
	dto = dao.getInfo(id);
	String go = request.getParameter("go");

%>


<jsp:include page="/template/header.jsp"></jsp:include>


<div align="center">
	<form action="change_info.do" method="post">
		<h1>회원 정보 수정</h1>
		<input type="tel" name="phone" placeholder="전화번호" value="<%= dto.getPhone() %>">
		<input type="text" name="post" placeholder="우편번호" value="<%= dto.getPostStr() %>">
		<input type="text" name="basic_addr" placeholder="기본주소" value="<%= dto.getBasic_addrStr() %>">
		<input type="text" name="extra_addr" placeholder="상세주소" value="<%= dto.getExtra_addrStr() %>">
		<input type="submit" value="완료">
		<input type="hidden" name="go" value="<%=go %>">
	</form>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
