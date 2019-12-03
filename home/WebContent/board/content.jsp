<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao dao = new BoardDao();
	BoardDto dto = dao.getInfo(no);
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<table>
		<tr>
			<th><%=dto.getTitle() %></th>
		</tr>
		<tr>
			<td><%=dto.getWriter() %></td>
		</tr>		
		<tr>
			<td><%=dto.getContent() %></td>
		</tr>
	</table>
</div>
<div>
<a href="write.jsp">글쓰기</a>
<a href="list.jsp">목록</a>
<a href="delete.do?no=<%=no%>">삭제</a>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>