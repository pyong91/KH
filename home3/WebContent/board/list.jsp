<%@page import="home.beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	

	// 페이징 추가
	
	// 페이지크기
	int pagesize = 10;
	// 네비게이터 크기
	int navsize = 10;
	
	int pno;
	try{
		pno = Integer.parseInt(request.getParameter("pno"));
		if(pno <= 0) throw new Exception();
	}
	catch(Exception e){
		pno = 1;
	}

	
	int finish = pno * pagesize;
	int start = finish - (pagesize - 1);
		
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	boolean isSearch = type != null && keyword != null;
	
	List<BoardDto> list;
	BoardDao dao = new BoardDao();

	if(isSearch){
		list = dao.search(type, keyword, start, finish);
	} else {
		list = dao.getList(start, finish);
	}
	/***************************************************
		하단 네비게이터 계산하기
		 - 시작블록 = (현재페이지-1) / 네비게이터크기 * 네비게이터크기 + 1
	***************************************************/
	int count = dao.getCount(type, keyword);
	

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
	<table width="80%" class="table table-hover">
		<tr>
			<th>번호</th>
			<th>그룹</th>
			<th>상위</th>
			<th>차수</th>
			<th align="left">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
		<%for(BoardDto dto : list){ %>
			<tr  align="center">
				<td width="60px"><%=dto.getNo() %></td>
				<td width="60px"><%=dto.getGroupno() %></td>
				<td width="60px"><%=dto.getSuperno() %></td>
				<td width="60px"><%=dto.getDepth() %></td>
				<td align="left">
				<%for(int i=0;i<dto.getDepth();i++) {%>
					&nbsp;&nbsp;
				<%} %>
				<%if(dto.getDepth()>0) {%>
					<img src="<%=request.getContextPath() %>/image/reply.png" width="30">
				<%} %>
				<a href="content.jsp?no=<%=dto.getNo() %>">
				<%if(dto.getHead()!=null) {%>
				[<%=dto.getHead() %>]
				<%} %>
				<%=dto.getTitle() %>
				<%if(dto.getReplyCount()>0) {%>
				<font color="red">
				[<%=dto.getReplyCount() %>]
				</font>
				<%} %>
				</a></td>
				<td width="120px"><%=dto.getWriter() %></td>
				<td width="120px"><%=dto.getWdateWithFormat() %></td>
				<td width="50px"><%=dto.getReadCount() %></td>
			</tr>
		<%} %>
	</table>
</div>
	<div class="footer">
		<div class="page">
			<jsp:include page="/template/navigator.jsp">
				<jsp:param name="pno" value="<%=pno%>"/>
				<jsp:param name="count" value="<%=count%>"/>
				<jsp:param name="navsize" value="<%=navsize%>"/>
				<jsp:param name="pagesize" value="<%=pagesize%>"/>
			</jsp:include>
			<form action="write.jsp">
				<input type="submit" value="글쓰기">
			</form>
		</div>

		<div class="search">
			<form action="list.jsp" method="get">
				<select name="type">
					<option value="no">번호</option>
					<option value="title">제목</option>
					<option value="writer">작성자</option>
				</select>
				<input type="text" name="keyword">
				<input type="submit" value="검색">
			</form>
		</div>
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>