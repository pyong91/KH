<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String context = request.getContextPath();
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<h2>로그인</h2>
<div align="center">
<form action="login.do" method="post">
	<table>
		<!-- 아이디 입력창, 비밀번호 입력창, 아이디 저장하기, 로그인 버튼, 찾기 링크 -->
		<tr>
			<td>
			<input type="text" name="id" placeholder="ID" required="required">
			</td>
		</tr>
		<tr>
			<td>
			<input type="password" name="pw" placeholder="PW" required="required">
			</td>
		</tr>
		<tr>
			<td>
			<input type="checkbox">
			아이디 저장하기
			</td>
		</tr>
		<tr align="right">
			<td>
			 <input type="submit" value="login">
			</td>
		</tr>
		<tr>
			<td>
			<a href="<%= context %>/member/find.jsp">아이디 찾기</a>
			<a href="#">비밀번호 찾기</a>
			<a href="<%= request.getContextPath() %>/member/regist.jsp">회원가입</a>
			</td>
		</tr>
		
	</table>
</form>

<%if(request.getParameter("error") != null) { %>
<!-- error라는 이름의 파라미터가 있다면 오류 메시지를 출력 -->
<h5><font color="red">입력하신 정보가 일치하지 않습니다</font></h5>
<%} %>
</div>
<jsp:include page="/template/footer.jsp"></jsp:include>
