<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
	<form action="login.do" method="post">
		<input type="text" name="id" placeholder="아이디를 입력하세요" required="required">
		<input type="password" name="pw" placeholder="비밀번호를 입력하세요" required="required">
		<input type="submit" value="로그인">
	</form>
</body>
</html>