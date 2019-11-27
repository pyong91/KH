<%@page import="home.beans.KHMemberDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.KHMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	KHMemberDao dao = new KHMemberDao();
	List<KHMemberDto> list = dao.getKHMember();
%>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test04_khmember-list 출력</title>
</head>
<body>
	<table border="1" width="500">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>아이디</th>
				<th>포인트</th>
				<th>가입날짜</th>
			</tr>
		</thead>
		<tbody align="center">
		<% for(KHMemberDto dto : list){ %>
			<tr>
			<td ><%=dto.getNo() %></td>
			<td ><%=dto.getName() %></td>
			<td ><%=dto.getId() %></td>
			<td class="no"><%=dto.getPoint() %></td>
			<td ><%=dto.getJoinDate() %></td>
			</tr>
		<%} %>
		</tbody>
	</table>
</body>
</html>