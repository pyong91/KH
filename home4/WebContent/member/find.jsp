<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/template/header.jsp"></jsp:include>
	<H2>아이디 찾기</H2>
		<form action="find.do" method="post">
		<table>
			<tr>
				<td><input type="text" name="name" required="required" placeholder="이름"></td>
			</tr>
			<tr>
				<td><input type="tel" name="phone" required="required" placeholder="전화번호"></td>
			</tr>
			<tr>
				<td><input type="submit" value="찾기">
			</tr>
		</table>
		</form>
<jsp:include page="/template/footer.jsp"></jsp:include>