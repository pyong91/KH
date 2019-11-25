<%@page import="beans.KHMemberDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.KHMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	KHMemberDao dao = new KHMemberDao();
	String name = request.getParameter("name");
	List<KHMemberDto> list = dao.search(name);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색</title>
<style type="text/css">
input[type="text"]{
	background: #white;
	border-radius: 22px;
}
input[type="submit"]{
	background: #white;
	border-radius: 22px;
}
</style>
<h1 align="center">KHMember 검색</h1>
</head>
<body>
  <div id="searchBar" align="center">
	<form action="Test05.jsp">
		<input type="text" name="name" placeholder="이름을 입력하세요" required="required" <%if(name!=null){%>value="<%=name%><%}%>">
		<input type="submit" value="검색"><br><br>
	</form>
  </div>
  <div id="table" align="center">
	<%if(list.size()==0 && name!=null){
	out.println("검색결과가 없습니다");
	}else if(list.size() > 0){ %>
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
	<%} %>
	</div>
</body>
</html>