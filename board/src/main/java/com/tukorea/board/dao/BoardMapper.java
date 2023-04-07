package com.tukorea.board.dao;

import com.tukorea.board.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public class BoardMapper {
    public int insertBoard(Board board);
    // 게시판 글 등록

    public int selectBoardListTotalCount();
    // 게시판 총 건수 조회

    public List<Board> seletBoardList(Map<String, Object> paramMap);

}
