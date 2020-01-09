<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!-- String context = request.getContextPath(); -->
<c:set var="context" value="${pageContext.request.contextPath}"/>

<!-- String id = (String)session.getAttribute("id"); -->
<!-- ${id } // ${sessionScope.id } --!>

<!--  //	로그인 상태 판정 -->
<!-- boolean login = id == null; -->
<c:set var="login" value="${not empty id}"/>
<!-- <c:set var="login" value="${id != null }" /> --!>

<!--  //	관리자 판정 -->
<!-- String grade = (String)session.getAttribute("grade"); -->
<!-- boolean admin = grade != null && grade.equals("관리자"); -->
<c:set var="admin" value="${grade == '관리자' }"/>




        <div class="menu">
          <label for="hamburg">&equiv;</label>
          <input type="checkbox" id="hamburg" />
          <a href="${context}" class="menu-item left-menu">홈으로</a>
          <a href="${context}/board/list.do" class="menu-item left-menu">게시판</a>
          
          <c:if test="${admin}">
      		  <a href="${context}/admin/list.do" class="menu-item left-menu">회원찾기</a>
      	  </c:if>
      	  
      	  <c:choose>
      	    <c:when test="${login}">
       		   <a href="${context}/member/logout.do" class="menu-item right-menu">로그아웃</a>
               <a href="${context}/member/info.do" class="menu-item right-menu">회원정보</a>
	        </c:when>
	        <c:otherwise>
       	 	  <a href="${context}/member/login.jsp" class="menu-item right-menu">로그인</a>
	          <a href="${context}/member/regist.jsp" class="menu-item right-menu">회원가입</a>
   		    </c:otherwise>
	      </c:choose>
        </div>
      