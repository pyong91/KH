<%@page import="home.beans.FilesDto"%>
<%@page import="home.beans.FilesDao"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.ReplyDto"%>
<%@page import="home.beans.ReplyDao"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center" style="padding-top:10px">
	<table width="70%" border="1px">
		<tr>
			<td>${bdto.title}</td>
		</tr>
		<tr>
			<td colspan="2">${bdto.writer}</td>
		</tr>		
		<tr height="200">
			<td valign="top" colspan="2">${bdto.content}</td>
		</tr>
			<!-- 첨부 파일 시작 -->
	<c:if test="${flist.size() > 0}">
	<tr>
		<td>
				 <ul>
				 	<c:forEach var="fdto" items="${flist}">
					 	<li>
					 		<!-- 미리보기 출력 -->
					 		<img src="download.do?no=${fdto.files_no}" width="80" height="50">

					 		${fdto.getUploadName()}
					 		(${fdto.getFileSize()} bytes)

					 		<img src="../image/download.png" width="15" height="15">
					 		<a href="download.do?no=${fdto.files_no}">
					 			<img src="../image/download.png" width="15" height="15">
					 		</a>
					 	</li>
				 	</c:forEach>
				 </ul>
		</td>
	</tr>
	</c:if>>
	<!-- 첨부 파일 끝 -->
		<tr>
			<td>조회수 : ${bdto.readCount}   댓글수 : ${bdto.replyCount}</td>
		</tr>
	</table>
		
		<!-- 댓글 시작 -->
	<table border="0" width="70%" style="background-color: #F9F9F9;">
		<tr>
			<td colspan="3">
				댓글 목록
			</td>
		</tr>
		<c:forEach var="rdto" items="${list}">
				<tr>
					<td rowspan="2" width="50px" align="center" valign="middle">
						<img src="${context}/image/고양이.jpg" width="30px" height="30px">
					</td>
					<td width="100px">${redto.writer}
						<c:if test="${rdto.writer == bdto.writer}">
						<font color="red">[작성자]</font>
						</c:if>
					</td>
					<td>${rdto.getWdateWithFormat()}</td>
					<c:if test="${rdto.writer==userId}">
						<td align="right">
							<form action="reply_delete.do" method="post">
								<input type="submit" value="삭제">
								<input type="hidden" name="origin" value="${rdto.origin}">
								<input type="hidden" name="reply_no" value="${rdto.reply_no}">
							</form>
						</td>
					</c:if>
				</tr>
				<tr>
					<td colspan="2" style="border-bottom: 1px dotted;">${rdto.content}</td>
				</tr>
		</c:forEach>	
	</table>
	<table border="0" width="70%">
		<tr>
			<td>
				<form action="reply_insert.do" method="post">
					<textarea name="content" rows="4" cols="92" required></textarea>
					<input type="submit" value="등록">
					<input type="hidden" name="origin" value="${bdto.no}">
				</form>
			</td>
		</tr>
	</table>
		<!-- 댓글 끝 -->
</div>
<div style="padding: 10px 0px">
	<a href="write.jsp"><input type="button" value="글쓰기"></a>
	<a href="write.jsp?superno=${bdto.no}"><input type="button" value="답글쓰기"></a>
	<c:if test="${isMine && isAdmin}">
		<a href="list.jsp"><input type="button" value="목록"></a>
		<a href="edit.jsp?no=${no}"><input type="button" value="수정"></a>	
		<a href="delete.do?no=${no}"><input type="button" value="삭제"></a>
	</c:if>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>