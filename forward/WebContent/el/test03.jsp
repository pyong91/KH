<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	EL의 scope
	- page : pageScope(생략가능)
	- request : requestScope(생략가능)
	- session : sessionScope(생략가능)
	- application : applicationScope(생략가능)
 -->
 
 <%
 	int a = 10; // page
 	pageContext.setAttribute("b", 20); // page
 	request.setAttribute("c", 30);	// request
 	session.setAttribute("d", 40);  // session
 	application.setAttribute("e", 50); // application
 %>
 
 
<h3>page : a = <%=a %> / ${a }</h3>
<h3>pageContext : b = <%=pageContext.getAttribute("b") %> / ${b } / ${pageScope.b }</h3>
<h3>request : c = <%=request.getAttribute("c") %> / ${c } / ${requestScope.c }</h3>
<h3>session : d = <%=session.getAttribute("d") %> / ${d } / ${sessionScope.d }</h3>
<h3>application : e = <%=application.getAttribute("e") %> / ${e } / ${applicationScope.e}</h3>