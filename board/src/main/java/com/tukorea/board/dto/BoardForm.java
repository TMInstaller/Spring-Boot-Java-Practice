package com.tukorea.board.dto;

public class BoardForm {
    private String title; // 제목
    private String writer; // 작성자
    private String password; // 비밀번호
    private String contents; // 내용

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getPassword() {
        return password;
    }

    public String getContents() {
        return contents;
    }
}
