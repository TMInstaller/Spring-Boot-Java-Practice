package com.tukorea.Project0317.controller;

// Spring 프로젝트가 띄워질 때 Spring container 가 생성됨.
// 그럼 Controller 라고 어노테이션이 설정된 클래스의 객체를 생성해서
// 해당 컨테이너에 넣어두고 스프링이 관리함

import com.tukorea.Project0317.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // Spring container 에 등록하면 객체가 하나만 등록되며 해당 객체로 돌려쓸 수 있음
    private final MemberService service;

    /**
     * DI의 생성자 주입 방식으로 MemberService 객체 생성
     * Autowired 어노테니션을 설정해놓으면 Spring Container 에 있는 해당 객체를 찾아서 연결해줌
     */
    @Autowired
    public MemberController(MemberService service){
        this.service = service;
    }
}
