<%@page import="java.util.List"%>
<%@page import="home.beans.ReplyDto"%>
<%@page import="home.beans.ReplyDao"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//	[1]번호 받기 [2]조회수 증가시키고 게시글 불러오기 [3]출력
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao bdao = new BoardDao();
	BoardDto bdto = bdao.getInfo(no);
	
	String userId = (String)session.getAttribute("id");
	String grade = (String)session.getAttribute("grade");
	
	boolean isMine = userId.equals(bdto.getWriter()); // 사용자ID == 작성자ID
	boolean isAdmin = grade.equals("관리자");
	
//	추가 : Set<Integer> 형태의 저장소를 이용하여 이미 읽은 글은 조회수 증가를 방지
//	[1] 세션에 있는 저장소를 꺼내고 없으면 생성한다
	Set<Integer> memory = (Set<Integer>)session.getAttribute("memory");
	// memory가 없는 경우에는 null 값을 가진다
	
	if(memory == null){
		memory = new HashSet<>();
	}
//	[2] 처리를 수행한다	
	boolean isFirst = memory.add(no);

//	처리를 마치고 저장소를 다시 세션에 저장한다	
	session.setAttribute("memory", memory); // 세션에 셋 저장
	
//	내글이아니면 ==!isMine	
//	처음읽는글이면 == isFirst
	if(!isMine && isFirst){
		bdto.setReadCount(bdto.getReadCount()+1);
		bdao.readCountPlus(no);
	}
	
// 댓글
	ReplyDao dao = new ReplyDao();
	List<ReplyDto> list = dao.getList(no);
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
		
		<!-- 댓글 시작 -->
	<table border="0" width="70%" style="background-color: #F9F9F9;">
		<tr>
			<td colspan="3">
				댓글 목록
			</td>
		</tr>
		<%for(ReplyDto dto : list) {%>
				<tr>
					<td rowspan="2" width="30px" align="center" valign="middle">
						<img src="#" style="size: 10%">
					</td>
					<td width="50px"><%=dto.getWriter() %></td>
					<td><%=dto.getWdateWithFormat() %></td>
				</tr>
				<tr>
					<td colspan="2" style="border-bottom: 1px dotted;"><%=dto.getContent() %></td>
				</tr>
			
		<%} %>
	</table>
	<table border="0" width="70%">
		<tr>
			<td>
				<form action="reply_insert.do" method="post">
					<textarea name="content" rows="4" cols="92" required></textarea>
					<input type="submit" value="등록">
					<input type="hidden" name="origin" value="<%=bdto.getNo()%>">
				</form>
			</td>
		</tr>
	</table>
		<!-- 댓글 끝 -->
</div>
<div style="padding: 10px 0px">
	<a href="write.jsp"><input type="button" value="글쓰기"></a>
	<a href="write.jsp?superno=<%= bdto.getNo() %>"><input type="button" value="답글쓰기"></a>
	<%if(isMine || isAdmin) {%>
		<a href="list.jsp"><input type="button" value="목록"></a>
		<a href="edit.jsp?no=<%=no%>"><input type="button" value="수정"></a>	
		<a href="delete.do?no=<%=no%>"><input type="button" value="삭제"></a>
	<%} %>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>