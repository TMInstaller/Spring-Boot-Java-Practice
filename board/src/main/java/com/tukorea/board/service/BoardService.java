package com.tukorea.board.service;

import com.tukorea.board.dao.BoardMapper;
import com.tukorea.board.domain.Board;
import com.tukorea.board.dto.BoardForm;
import com.tukorea.board.dto.BoardList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    pubcic Map<String, Object> getBoardList(int pageNum){
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            // [1] 게시물 총 건수 조회
            int totalCount = mapper.selectBoardListTotalCount();
            result.put("totalCount", totalCount);

            System.out.println("[1] 게시물 총 건수 조회 완료(" + totalCount + "건)");
            // [2] 게시판 목록 조회
            // 목록 조회용 파라미터 설정
            int listNum = 10; // 게시판 페이지 별 건수 설정
            int startNum = (pageNum - 1) * listNum; // 게시판 목록 조회 시작점 설정

            Map<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("startNum", startNum);
            paramMap.put("listNum", listNum);

            // 게시판 목록 조회
            List<Board> dbBoardList = mapper.seletBoardList(paramMap);
            // 도메인에서 게시판 목록용 DTO로 전환
            List<BoardList> boardList = new ArrayList<BoardList>();
            int listStartNum = ((pageNum - 1) * listNum) + 1;

            for(Board board: dbBoardList){
                BoardList listObj = new BoardList();

                listObj.setNo(listStartNum++); // NO
                listObj.setBoardSeq(board.getBoardSeq()); // 게시물 시퀀스
                listObj.setTitle(board.getTitle()); // 제목
                listObj.setWriter(board.getWriter()); // 작성자
                listObj.setHits(board.getHits()); // 조회수
                listObj.setRegDt(board.getRegDt()); // 등록일시

                boardList.add(listObj);
            }

            result.put("boardList", boardList);

            System.out.println("[2] 게시물 목록 조회 완료");

            // 게시판 페이징 생성
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}