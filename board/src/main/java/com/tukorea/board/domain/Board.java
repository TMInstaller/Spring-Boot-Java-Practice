package com.tukorea.board.domain;

public class Board {
    private int boardSeq; // 게시판 시퀸스
    private String title; // 제목
    private String writer; // 작성자
    private String password; // 비밀번호
    private String contents; // 내용
    private int hits; // 조회수
    private String regDt; // 등록일시
    private String modDt; // 수정일시

    public void setBoardSeq(int boardSeq) {
        this.boardSeq = boardSeq;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }

    public void setModDt(String modDt) {
        this.modDt = modDt;
    }
}
