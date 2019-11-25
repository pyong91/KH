<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>입력</title>
</head>

<body>
    <form action="regist.do" method="post">
       	<input type="text" name="id" required="required" placeholder="아이디를 입력하라"><br>
       	<input type="text" name="name" required="required" placeholder="이름을 입력하라"><br>
  	  	<input type="password" name="pw" required="required" placeholder="비밀번호를 입력하라"><br><br>
		<input type="submit" value="등록">
    </form>
</body>

</html>