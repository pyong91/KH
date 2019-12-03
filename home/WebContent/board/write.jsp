<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)request.getSession().getAttribute("id");
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<form action="write.do" method="post">
	<table>
		<tr>
			<th>게시판</th>
			<th>
			<select name="head">
				<option value="">말머리선택</option>
				<option value="공지">공지</option>
				<option value="정보">정보</option>
				<option value="유머">유머</option>
			</select>
			</th>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" placeholder="게시글 제목을 입력하세요"></td>
		</tr>
		<tr>
			<td colspan="2">
				<textarea name="content" rows="20" cols="50"></textarea>
			</td>
		</tr>
		<tr>
			<td><input type="hidden" name="id" value="<%=id%>"><td>
			<td><input type="submit" value="확인"></td>
		</tr>
	</table>
	</form>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>