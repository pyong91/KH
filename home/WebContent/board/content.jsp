<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//	[1]번호 받기 [2]조회수 증가시키고 게시글 불러오기 [3]출력
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao bdao = new BoardDao();
	bdao.readCountPlus(no);
	BoardDto bdto = bdao.getInfo(no);
	
	String userId = (String)session.getAttribute("id");
	String grade = (String)session.getAttribute("grade");
	
	boolean isMine = userId.equals(bdto.getWriter()); // 사용자ID == 작성자ID
	boolean isAdmin = grade.equals("관리자");
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<table border="1" width="70%">
		<tr>
			<td><%=bdto.getTitle() %></td>
		</tr>
		<tr>
			<td><%=bdto.getWriter() %></td>
		</tr>		
		<tr height="200">
			<td valign="top"><%=bdto.getContent() %></td>
		</tr>
		<tr>
			<td>조회수 : <%=bdto.getReadCount() %> 댓글수 : <%=bdto.getReplyCount() %></td>
		</tr>
	</table>
</div>
<div style="padding: 10px 0px">
	<a href="write.jsp"><input type="button" value="글쓰기"></a>
	<a href="#"><input type="button" value="답글쓰기"></a>
	<%if(isMine || isAdmin) {%>
		<a href="list.jsp"><input type="button" value="목록"></a>
		<a href="edit.jsp?no=<%=no%>"><input type="button" value="수정"></a>	
		<a href="delete.do?no=<%=no%>"><input type="button" value="삭제"></a>
	<%} %>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>