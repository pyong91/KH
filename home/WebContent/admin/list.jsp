<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberDao dao = new MemberDao();
	String id = request.getParameter("id");
	List<MemberDto> list = dao.search(id);
%>


<jsp:include page="/template/header.jsp"></jsp:include>

<h1>회원 검색</h1>
<form action="list.jsp">
	<input type="text" name="id" placeholder="아이디"> <input
		type="submit" value="검색">
		
<div align="center">
	<table border="1">
	<%if(list.size()!=0) {%>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>우편번호</th>
				<th>기본주소</th>
				<th>상세주소</th>
				<th>전화번호</th>
			</tr>
		</thead>
	<%} %>
		<tbody>
		<% for (MemberDto dto : list) {	%>
			<tr align="center">
				<td width="100" height="10"><%=dto.getId()%></td>
				<td width="100" height="10"><%=dto.getName()%></td>
				<td width="100" height="10"><%=dto.getPost()%></td>
				<td width="100" height="10"><%=dto.getBasic_addr()%></td>
				<td width="100" height="10"><%=dto.getExtra_addr()%></td>
				<td width="100" height="10"><%=dto.getPhone()%></td>
			</tr>
		</tbody>
 		<%
			}
		%>
 		</table>	
	 </div>
	</form>
	
<jsp:include page="/template/footer.jsp"></jsp:include>