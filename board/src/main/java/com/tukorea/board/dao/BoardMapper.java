package com.tukorea.board.dao;

import com.tukorea.board.domain.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public class BoardMapper {
    // 게시판 글 등록
    public int insertBoard(Board board);
    
}
