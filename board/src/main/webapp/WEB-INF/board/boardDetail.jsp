<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>게시판 상세 페이지</title>
    <style type="text/css">
      div.container {
        width: 1000px;
      }

      p.title {
        border: 1px solid #000000;
        padding: 20px 10px;
        text-align: center;
        font-weight: bold;
        background: #f9f9f9;
      }

      table.form-table {
        width: 100%;
        border: 1px solid #000000;
        border-collapse: collapse;
        margin-bottom: 10px;
      }

      table.form-table th,
      table.form-table td {
        border: 1px solid #000000;
      }

      table.form-table th {
        width: 25%;
      }

      table.form-table td {
        padding: 2px 5px 3px 5px;
      }

      table.form-table td.long-text {
        white-space: pre-line;
      }

      div.button-area {
        text-align: right;
      }

      div.button-area a.button {
        font-size: 13px;
        border: 1px solid #000000;
        border-radius: 3px;
        padding: 3px 7px;
        text-decoration: none;
        color: #000000;
        background: #f9f9f9;
        cursor: pointer;
      }

      div.button-area a.button:hover {
        font-weight: bold;
        background: #e7e7e7;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <p class="title">Spring Boot로 만들어보는 게시판</p>
      <table class="form-table">
        <tr>
          <th>제목</th>
          <td>${board.title}</td>
        </tr>
        <tr>
          <th>작성자</th>
          <td>${board.writer}</td>
        </tr>
        <tr>
          <th>내용</th>
          <td class="long-text">${board.contents}</td>
        </tr>
      </table>
      <div class="button-area">
        <a class="button left" href="#">수정</a>
        <a class="button left" href="#">삭제</a>
        <a class="button" href="/board/list">게시판 목록</a>
      </div>
    </div>
  </body>
</html>
