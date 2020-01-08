<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	JSTL을 이용한 반복
	 - c:forEach (일반적인 반복문)
	 - c:forTokens (자바 String의 split같은 반복. 구분자로 구분)
 -->
 
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <c:forEach var="i" begin="1" end="10" step="1">
 	<h3>hello ${i}</h3>
 </c:forEach>
 
 <c:set var="list" value="10,20,30,40,50"/>
 
 <c:forEach var="j" items="${list}" varStatus="loop">
 	<h3>${loop.count}번째 값 : ${j} / ${loop.first} / ${loop.last}</h3>
 </c:forEach>
 
 <c:set var="color" value="빨/주/노/초/파/남/보"/>
 <c:forTokens var="c" items="${color}" delims="/">
 	<h3>c = ${c}</h3>
 </c:forTokens>