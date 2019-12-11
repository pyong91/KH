<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 네비게이터(navigator -->
<!-- 
	반드시 받아야 하는 데이터 : type, keyword, pno, count, navsize
 -->
 
 <%
 	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	boolean isSearch = type != null && keyword != null;
	int pno = Integer.parseInt(request.getParameter("pno"));	// 현재 페이지 번호
	int count = Integer.parseInt(request.getParameter("count"));	// 총 게시글 수
	int navsize = Integer.parseInt(request.getParameter("navsize"));	// 보여줄 페이지 번호 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize")); // 보여줄 게시글 수 
	int pageCount = (count + pagesize) / pagesize;	// 총 페이지 수
	int startBlock = (pno - 1) / navsize * navsize + 1;	// 보여줄 페이지의 첫번째 번호 (21(startBlock)~30)
	int finishBlock = startBlock + (navsize - 1);	// 보여줄 페이지의 마지막 번호(21~30(finishBlock))
	//만약 마지막 블록이 페이지 수보다 크다면 수정 처리
	// 페이지 마지막번호 > 총페이지  -> 마지막번호에 총페이지 대입
	if(finishBlock > pageCount){
		finishBlock = pageCount;
	}

 %>
 
 <h4>
	<%if(startBlock >1) {%> <!-- 11페이지 부터 이전 표시(1페이지에선 1이라 표시안됨) -->
		<%if(isSearch) {%>
			<a href="<%=request.getRequestURI() %>?type=<%=type%>&keyword=<%=keyword%>&pno=<%=startBlock - 1%>">[이전]</a>  
		<%}else{ %>
			<a href="<%=request.getRequestURI() %>?pno=<%=startBlock-1%>">[이전]</a>
		<%} %>
	<%} %>
	<%for(int i=startBlock; i<=finishBlock; i++){ %>
		<%if(pno==i){%>
			<%=i%> 
		<%} else {%>
			<%if(isSearch) {%>
				<a href="<%=request.getRequestURI() %>?type=<%=type%>&keyword=<%=keyword%>&pno=<%=i%>"><%=i%></a>				
			<%}else{ %>
				<a href="<%=request.getRequestURI() %>?pno=<%=i%>"><%=i %></a>
			<%} %>
		<%} %>
	<%} %>				
		<%if(pageCount > finishBlock) {%>
		<%if(isSearch) {%>
			<a href="<%=request.getRequestURI() %>?type=<%=type%>&keyword=<%=keyword%>&pno=<%=finishBlock + 1%>">[다음]</a>
		<%}else{ %>
			<a href="<%=request.getRequestURI() %>?pno=<%=finishBlock+1 %>">[다음]</a>
		<%} %>
	<%} %>
</h4>