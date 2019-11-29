<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	공통 모듈로 사용할 비밀번호 검사 페이지
	 - 목적지 정보를 받아서 hidden 형태로 form에 첨부
 --%>

<%
	String go = request.getParameter("go");
%>



<jsp:include page="/template/header.jsp"></jsp:include>


<div align="center">

	<form action="check_pw.do" method="post">
	
	<h1>비밀번호 확인</h1>
	<input type="password" name="pw" required>
	<input type="submit" value="완료">
	<input type="hidden" name="go" value="<%=go %>">
	</form>
		
	<%if(request.getParameter("error") != null){ %>
	<h4><font color="red">비밀번호를 다시 확인해주세요 </font></h4>
	<%} %>

</div>


<jsp:include page="/template/footer.jsp"></jsp:include>