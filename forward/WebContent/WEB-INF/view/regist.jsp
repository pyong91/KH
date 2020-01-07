<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regist.do" method="post">
    <div align="center">
      <table>
        <thead>
          <tr>
            <th><h1>회원가입</h1></th>
          </tr>
        </thead>
        <tbody>
          <tr>
          	<td>아이디</td>
            <td>
              <input type="text" name="id" required="required" placeholder="아이디" />
            </td>
          </tr>
          <tr>
          	<td>비밀번호</td>
            <td>
              <input type="password" name="pw" required="required" placeholder="비밀번호"/>
            </td>
          </tr>
          <tr>
          	<td>이름</td>
            <td>
              <input type="text" name="name" required="required" placeholder="이름"/>
            </td>
          </tr>
          <tr>
          	<td>우편번호</td>
            <td>
              <input type="text" name="post" placeholder="우편변호"/>
            </td>
          </tr>
          <tr>
          	<td>기본주소</td>
            <td>
              <input type="text" name="basic_addr" placeholder="기본주소"/>
            </td>
          </tr>
          <tr>
          	<td>상세주소</td>
            <td>
              <input type="text" name="extra_addr" placeholder="상세주소"/>
            </td>
          </tr>
          <tr>
          	<td>전화번호</td>
            <td>
              <input type="tel" name="phone" required="required" placeholder="전화번호"/>
            </td>
          </tr>
          <tr>
              <td align="center">
                  <input type="submit" value="가입하기">
              </td>
          </tr>
        </tbody>
      </table>
    </div>
    </form>
</body>
</html>