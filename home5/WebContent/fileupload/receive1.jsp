<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//전송된 데이터를 분석
	String method = request.getMethod();//전송방식(GET/POST)
	String ip = request.getRemoteAddr();//전송자 IP
	
	request.setCharacterEncoding("UTF-8");
	String uploader = request.getParameter("uploader");
	String test = request.getParameter("test");
%>

<h2>method : <%=method%></h2>
<h2>ip : <%=ip%></h2>

<h2>uploader : <%=uploader%></h2>
<h2>test : <%=test%></h2>