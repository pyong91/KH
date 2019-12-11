<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>홈피</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css" />
    <style>
      /* 개발용 설정 : 영역에 점선이 출력되도록 처리 */
      body[test] main,
      body[test] header,
      body[test] nav,
      body[test] section,
      body[test] footer,
      body[test] article,
      body[test] aside,
      body[test] div,
      body[test] span,
      body[test] label,
      body[test] p {
        border: 1px dotted black;
      }
      /* 
        화면 레이아웃
        - 전체 화면은 1000px로 한다
        - 홈페이지는 브라우저 가운데 위치한다.
        - 영역별 내부 여백은 글자 2개 높이만큼으로 한다.
      */
      main {
        width: 1000px;
        margin: auto;
      }

      header,
      section,
      footer {
        padding: 2rem;
      }
      /* 
        내부 영역 스타일
        - section 내부에 화면을 배치할 때 필요한 구성요소들을 미리 디자인
        - 영역(article) - 폭을 숫자로 지정할 수 있도록 구성
      */
      .w-100 {
        width: 100%;
      }
      .w-90 {
        width: 90%;
      }
      .w-80 {
        width: 80%;
      }
      .w-70 {
        width: 70%;
      }
      .w-60 {
        width: 60%;
      }
      .w-50 {
        width: 50%;
      }
      .w-40 {
        width: 40%;
      }
      .w-30 {
        width: 30%;
      }
      .w-20 {
        width: 20%;
      }
      .w-10 {
        width: 10%;
      }
      article {
        margin: auto;
      }
      .row {
        margin: 10px 0px;
        text-align: center;
      }
      .row > * {
        width: 100%;
      }
      /* 여백 */
      .row-empty {
        height: 20px;
      }
    </style>
  </head>
  <body>
    <main>
      <header>헤더</header>
      <nav>
        <jsp:include page="/template/menu.jsp"></jsp:include>
      </nav>
      <section>
      <div class="row-empty"></div>
<div class="row-empty"></div>