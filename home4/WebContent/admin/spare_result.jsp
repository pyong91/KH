<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//session에 들어있는 pw 데이터를 꺼낸 뒤 항목 삭제
	String pw = (String)session.getAttribute("pw");
	session.removeAttribute("pw");
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>임시 비밀번호 발급이 완료되었습니다</h2>
	<h3>비밀번호 = <%=pw%></h3>
</div>
<jsp:include page="/template/footer.jsp"></jsp:include>