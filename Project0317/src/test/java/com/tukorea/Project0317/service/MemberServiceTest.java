package com.tukorea.Project0317.service;

import com.tukorea.Project0317.domain.Member;
import com.tukorea.Project0317.repository.MemberRepositoryIF;
import com.tukorea.Project0317.repository.MemoryMemberRepository;
import com.tukorea.Project0317.repository.MemoryMemberRepositoryTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService service;
    MemoryMemberRepository repo;
    @BeforeEach
    void beforeEach(){
        repo = new MemoryMemberRepository();
        service = new MemberService(repo);
    }

    @Test
    void testJoin() {
        // 회원가입 테스트 메서드 구현
        // 회원 정보 설정
        Member member = new Member();
        member.setName("Spring");

        // 회원 정보 추가
        int memberId = service.join(member);
        System.out.println("(1) result : " + memberId);
    }

    @Test
    void testSameNameJoin() {
        // 동일 이름으로 회원가입 테스트 메서드 구현
        // 회원 정보 설정
        Member member1 = new Member();
        member1.setName("Spring");

        Member member2 = new Member();
        member2.setName("Spring");

        // 회원 정보 추가
        service.join(member1);
        service.join(member2);
    }
}
