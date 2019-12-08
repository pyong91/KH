<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 필요한 데이터를 불러오기 위한 자바 코드 작업
	//  - 관리자가 회원을 검색하기 위한 페이지이므로 검색기능만 구현
	//  - 검색어가 없으면 빈 페이지 출력
	// [1] 검색어 받기(type, keyword)
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	// [2] 검색인지 아닌지 판정
// 	boolean isSearch = type도 있고 keyword도 있으면;
	boolean isSearch = type != null && keyword != null;
	
	// [3] 처리
	MemberDao dao = new MemberDao();
	List<MemberDto> list;
	if(isSearch){
		list = dao.search(type, keyword);
	}
	else{
		list = null;
	}
%>
<style>
.list_table{
padding-top: 15px;
}
</style>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
<h1>회원 검색</h1>
<form action="list.jsp" class="list_table" method="get">
<!-- 	<input type="text" name="type"> -->
	<select name="type">
		<option value="id">아이디</option>
		<option value="name">이름</option>
		<option value="grade">등급</option>
		<option value="phone">전화번호</option>
	</select>
	<input type="text" name="keyword" placeholder="아이디"> 
	<input type="submit" value="검색">
</form>
	<%if(list == null) {%>
		<h1>검색어를 입력해주세요</h1>
	<%} else {%>
	<table border="1" width="80%">
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등급</th>
				<th>전화번호</th>
				<th>가입일</th>
				<th>포인트</th>
				<th>관리메뉴</th>
			</tr>
		</thead>
		<tbody align="center">
		<% for (MemberDto dto : list) {	%>
			<tr>
				<td><%=dto.getId()%></td>
				<td><%=dto.getName()%></td>
				<td><%=dto.getGrade()%></td>
				<td><%=dto.getPhone()%></td>
				<td><%=dto.getJoindateWithFormat()%></td>
				<td><%=dto.getPoint()%></td>
				<!-- 관리메뉴 -->
				<td>
					<a href="detail.jsp?id=<%=dto.getId()%>">상세정보</a>
<!-- 					<a href="#">휴면계정 전환</a> -->
					<a href="#">비밀번호 변경</a>
					<a href="#">회원탈퇴</a>
				</td>
			</tr>
 		<%
			}
		%>
		</tbody>
 		</table>	
 		<%} %>
	 </div>
	
<jsp:include page="/template/footer.jsp"></jsp:include>