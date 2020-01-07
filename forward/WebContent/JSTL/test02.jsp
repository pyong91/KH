<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	- JSTL은 javascript처럼 자료형을 크게 구분하지 않는다(내부적으로 관리)
	- JSTL에서 데이터를 만들면 pageContext에 저장된다 (pageScope)
 -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="a" value="10"/>

<h1>a = <%=pageContext.getAttribute("a") %></h1>
<h1>a = ${a}</h1>

<c:set var="a" value="${a+5}"/>
<h1>a = ${a}</h1>
<c:remove var="a"/>
<h1>a = ${a}</h1>