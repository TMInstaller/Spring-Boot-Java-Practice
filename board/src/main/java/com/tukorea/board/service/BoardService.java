package com.tukorea.board.service;

import com.tukorea.board.dao.BoardMapper;
import com.tukorea.board.domain.Board;
import com.tukorea.board.dto.BoardForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }
    public void addBoard(BoardForm boardForm){
        try {
            // 등록용 파라미터 정제(DTO -> Domain)
            Board board = new Board();
            board.setTitle(boardForm.getTitle());
            board.setWriter(boardForm.getWriter());
            board.setPassword(boardForm.getPassword());
            board.setContents(boardForm.getContents());

            // 게시판 등록
            int resultCount = mapper.insertBoard(board);
            System.out.println("게시판 등록 완료 (건수 : " + resultCount + "건");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}