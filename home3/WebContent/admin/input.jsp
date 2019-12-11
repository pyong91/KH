<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.getInfo(id);
%>

<jsp:include page="/template/header.jsp"></jsp:include>
<form action="input.do" method="post">
<div align="center">

	<h2>회원 정보 수정</h2>

	<table>
		<tbody>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" value="<%=dto.getPhone()%>"></td>
			</tr>
			<tr>
				<th>우편번호</th>
				<td><input type="text" name="post" value="<%=dto.getPost()%>"></td>
			</tr>
			<tr>
				<th>기본주소</th>
				<td><input type="text" name="basic_addr" value="<%=dto.getBasic_addr()%>"></td>
			</tr>
			<tr>
				<th>상세주소</th>
				<td><input type="text" name="extra_addr" value="<%=dto.getExtra_addr()%>"></td>
			</tr>
			<tr>
				<th>등급</th>
<%-- 				<td><input type="text" name="grade" value="<%=dto.getGrade()%>"></td> --%>
				<td>
				<select name="grade">
					<option>일반회원</option>
					<option>우수회원</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>포인트</th>
				<td><input type="text" name="point" value="<%=dto.getPoint()%>"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="<%=dto.getName()%>"></td>
			</tr>
			<tr>
				<td><input type="hidden" name="id" value="<%=id%>"></td>
				<td align="right"><input type="submit" value="변경"></td>
			</tr>
		</tbody>
	</table>
</div>
</form>

<jsp:include page="/template/footer.jsp"></jsp:include>