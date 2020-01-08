<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String go = request.getParameter("go");
%>

<jsp:include page="/template/header.jsp"></jsp:include>


<div align="center">

	<form action="change_pw.do" method="post">
	
	<h1>신규 비밀번호 입력</h1>
	<input type="password" name="pw" required>
	<input type="submit" value="완료">
	<input type="hidden" name="go" value="<%=go %>">
	</form>
	
</div>


<jsp:include page="/template/footer.jsp"></jsp:include>