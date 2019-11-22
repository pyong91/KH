<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단예제</title>
</head>
<body>
	<div align="center">
		<h1>구구단</h1>
		<table border="1">
			<thead>
				<tr>
				<%for(int i = 2; i <= 9; i++){ %>
					<th width="50"><%=i %>단</th>
				<%} %>
				</tr>
			</thead>
			<tbody align="center">
				<%for(int i = 1; i <= 9; i++) {%>
				<tr>
				<%for(int j = 2; j <=9; j++){ %>
					<td width="120"><%=j %> X <%=i%> = <%=i*j%></td>
				<%} %>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
</body>
</html>