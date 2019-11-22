<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- hello jsp 10번 출력 -->
	<% for (int i = 1; i <= 10; i++) { %>
<%-- 		<h1>Hello JSP <%out.println(i);%></h1> --%>
		<h1>Hello JSP <%=i%></h1>
	<% } %>
</body>
</html>