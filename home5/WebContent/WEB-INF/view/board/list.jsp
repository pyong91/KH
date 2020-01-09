<%@page import="home.beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="context" value="${pageContext.request.contextPath}" />
    
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
		<c:forEach var="dto" items="${list}">
			<tr  align="center">
				<td width="60px">${dto.no}</td>
				<td width="60px">${dto.groupno}</td>
				<td width="60px">${dto.superno}</td>
				<td width="60px">${dto.depth}</td>
				<td align="left">
				<c:forEach var="i" begin="0" end="${dto.depth}" step="1">
					&nbsp;&nbsp;
				</c:forEach>
				<c:if test="${dto.depth>0}">
					<img src="${context}/image/reply.png" width="30">
				</c:if>
				<a href="content.do?no=${dto.no}">
				<c:if test="${not empty dto.head}">
				[${dto.head}]
				</c:if>
				${dto.title}
				<c:if test="${dto.replyCount>0}">
				<font color="red">
				[${dto.replyCount}]
				</font>
				</c:if>
				</a></td>
				<td width="120px">${dto.writer}</td>
				<td width="120px">${dto.getWdateWithFormat()}</td>
				<td width="50px">${dto.readCount}</td>
			</tr>		
		</c:forEach>
	</table>
</div>
	<div class="footer">
		<div class="page">
			<jsp:include page="/template/navigator.jsp">
				<jsp:param name="pno" value="${pno}"/>
				<jsp:param name="count" value="${count}"/>
				<jsp:param name="navsize" value="${navsize}"/>
				<jsp:param name="pagesize" value="${pagesize}"/>
			</jsp:include>
			<form action="write.jsp">
				<input type="submit" value="글쓰기">
			</form>
		</div>

		<div class="search">
			<form action="list.do" method="get">
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