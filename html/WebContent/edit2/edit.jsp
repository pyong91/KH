<%@page import="beans.SnackDto"%>
<%@page import="beans.SnackDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//이 페이지를 실행하려면 반드시 파라미터에 "번호(no)"가 있어야 한다.
	int no = Integer.parseInt(request.getParameter("no"));
	
	SnackDao dao = new SnackDao();
	SnackDto dto = dao.get(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 과자의 정보를 수정할 수 있도록 입력창을 제공 -->
	<h2>정보 수정</h2>
	<form action="edit.do" method="post">
		<input type="hidden" name="no" value="<%= dto.getNo() %>" readonly="readonly"><br><br>
		<input type="text" name="name" value="<%= dto.getName() %>"><br><br>
		<input type="text" name="price" value="<%= dto.getPrice() %>"><br><br>
		<input type="text" name="stock" value="<%= dto.getStock() %>"><br><br>
		<input type="submit"><br><br>
		
	</form>
</body>
</html>