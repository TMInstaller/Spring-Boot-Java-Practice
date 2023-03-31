package com.tukorea.board.controller;

import com.tukorea.board.dto.BoardForm;
import com.tukorea.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @GetMapping("/board/form")
    public String addBoardForm() {
        return "board/addBoardForm";
    }

    @PostMapping("board/new")
    public String addBoard(BoardForm boardForm) {
        // 게시판 등록 메서드 호출
        service.addBoard(boardForm);

        // TODO 목록 개발 전까지는 /board/form 으로 redirect 가게 처리
        return "redirect:/board/list";
    }

    @GetMapping("/board/list")
    public String getBoardList(){
        // 게시판 목록 조회 메서드 호출
        return "board/boardList";
    }
}
