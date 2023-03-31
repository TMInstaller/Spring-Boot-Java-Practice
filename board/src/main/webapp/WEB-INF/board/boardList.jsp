<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"
prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>게시판 목록 페이지</title>
    <style type="text/css">
      div.container {
        width: 1000px;
      }

      p.title {
        border: 1px solid #000000;
      }

      table.form-table {
        width: 100%;
        border: 1px solid #000000;
        border-collapse: collapse;
        margin-top: 20px;
        margin-bottom: 10px;
      }

      table.form-table th,
      table.form-table td {
        border: 1px solid #000000;
      }

      table.form-table td {
        padding: 2px 5px 3px 5px;
        text-align: center;
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

      div.paging {
        text-align: center;
      }

      div.paging a.current {
        font-weight: bold;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <p class="title">Spring boot로 만들어보는 게시판</p>

      <div class="button-area">
        <a class="button" href="/board/form">게시물 등록</a>
      </div>

      <table class="form-table">
        <thead>
          <tr>
            <th style="width: 50px">#</th>
            <th>제목</th>
            <th style="width: 200px">작성자</th>
            <th style="width: 80px">조회수</th>
            <th style="width: 140px">등록일시</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td style="text-align: left">
              <a href="#none">게시글 제목입니다</a>
            </td>
            <td>작성자</td>
            <td>0</td>
            <td>2023-03-31 09:30</td>
          </tr>
        </tbody>
      </table>

      <div class="paging">
        <a href="#none">&lt;</a>
        <a class="current" href="#none">1</a>
        <a href="#none">2</a>
        <a href="#none">3</a>
        <a href="#none">4</a>
        <a href="#none">5</a>
        <a href="#none">&gt;</a>
      </div>
    </div>
  </body>
</html>
