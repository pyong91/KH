<%@page import="beans.SnackDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.SnackDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
	SnackDao dao = new SnackDao();
	String name = request.getParameter("name");
	List<SnackDto> list = dao.search(name);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과자 검색</title>
	<h1 align="center">과자 검색</h1>
</head>
<body>
	<div class="searchBar" align="center">
		<form action="http://localhost:8080/html/jsp/Test07.jsp" method="post">
			<input type="text" name="name" placeholder="이름을 입력하세요" 
				<%if(name!=null){%>
					value="<%=name %>"
				<%} %>>
			<input type="submit" value="검색">
		</form>
	</div>
	<%if(name!=null && list.size() > 0) {%>
	<div class="table" align="center">
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>가격</th>
					<th>재고수량</th>
				</tr>
			</thead>
			<tbody align="center">
				<%for(SnackDto dto : list) {%>
				<tr>
					<td><%=dto.getNo() %></td>
					<td><%=dto.getName() %></td>
					<td align="right"><%=dto.getPrice() %></td>
					<td align="right"><%=dto.getStock() %></td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
	<%}else if(name!=null && list.size() == 0){%>
		<h2 align="center">검색결과없음</h2>
	<%}%>
</body>
</html>