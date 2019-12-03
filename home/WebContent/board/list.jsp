<%@page import="home.beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BoardDao dao = new BoardDao();
	List<BoardDto> list = dao.getList();
%>    
    
<style>
.body{
	
}
.con_table{
padding-top: 10px;
}
.footer{
}
th, td{
 height: 30px;
 
}
</style>    

    
<jsp:include page="/template/header.jsp"></jsp:include>
<div class="body">
<div class="con_table" align="center">
	<table width="80%">
		<tr>
			<th>번호</th>
			<th align="left">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
		<%for(BoardDto dto : list){ %>
			<tr  align="center">
				<td width="60px"><%=dto.getNo() %></td>
				<td align="left"><a href="content.jsp?no=<%=dto.getNo() %>">
				<%if(dto.getHead()!=null) {%>
				[<%=dto.getHead() %>]
				<%} %>
				<%=dto.getTitle() %>
				</a></td>
				<td width="120px"><%=dto.getWriter() %></td>
				<td width="120px"><%=dto.getWdateWithFormat() %></td>
				<td width="50px"><%=dto.getReadCount() %></td>
			</tr>
		<%} %>
	</table>
</div>
<div class="footer">
	<form action="write.jsp">
		<input type="submit" value="글쓰기">
	</form>
</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>