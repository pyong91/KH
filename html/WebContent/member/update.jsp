<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1>KH 비밀번호 변경</h1>
	<form action="update.do" method="post">
		<input type="text" name="id" required="required" placeholder="아이디"><br><br>
		<input type="password" name="pw" required="required" placeholder="비밀번호"><br><br>
		<input type="password" name="new_pw" required="required" placeholder="새로운 비밀번호"><br><br>
		<input type="submit" value="변경">
	</form>
	</div>
</body>
</html>