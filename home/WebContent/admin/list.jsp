<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberDao dao = new MemberDao();
	String id = request.getParameter("id");
	List<MemberDto> list = dao.search(id);
%>


<jsp:include page="/template/header.jsp"></jsp:include>

<h1>회원 검색</h1>
<form action="list.jsp">
<input type="text" name="id" placeholder="아이디">
<input type="submit" value="검색">
</form>

<%	for(MemberDto dto : list) {%>
		<%=dto.getId()%>
		<%=dto.getPw()%>
		<%=dto.getName()%>
		<%=dto.getPost()%>
		<%=dto.getBasic_addr() %>
		<%=dto.getExtra_addr() %>
		<%=dto.getPhone() %>
	<%} %>




<jsp:include page="/template/footer.jsp"></jsp:include>