package com.tukorea.Project0317.repository;

import com.tukorea.Project0317.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repo = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        //테스트 메소드 실행 후 매번 실행되는 메소드, store 객체 비움 진행
        repo.clearStorage();
    }
    @Test
    public void testInsertMember() {
        // 회원 정보 설정
        Member member = new Member();
        member.setName("Spring");

        // 회원 정보 추가
        Member result = repo.insertMember(member);
        System.out.println("(1) result : " + result.getId() + " / " + result.getName());
    }

    @Test
    public void testSelectMemberById() {
        // 회원 정보 설정
        Member member = new Member();
        member.setName("Spring");

        // 회원 정보 추가
        repo.insertMember(member);

        // 아이디로 회원 정보 조회
        Member result = repo.selectMemberById(member.getId());
//        Member result = repo.selectMemberById(99); // 없을 법한 숫자 넣어보기 - 에러 발생
        System.out.println("(2) result : " + result.getId() + " / " + result.getName());
    }

    @Test
    public void testSelectMemberByName() {
        // 회원 정보 설정
        Member member1 = new Member();
        member1.setName("hello1");

        Member member2 = new Member();
        member2.setName("hello2");

        // 회원 정보 추가
        repo.insertMember(member1);
        repo.insertMember(member2);

        // 이름으로 회원 정보 조회
        Member result = repo.selectMemberByName("hello1");
//        Member result = repo.selectMemberByName("Ji-Won"); // 없는 이름으로 조회해보기 - 에러
        System.out.println("(3) result : " + result.getId() + " / " + result.getName());
    }

    @Test
    public void testSelectMemberList() {
        // 회원 정보 설정
        Member member1 = new Member();
        member1.setName("check-all 1");

        Member member2 = new Member();
        member2.setName("check-all 2");

        // 회원 정보 추가
        repo.insertMember(member1);
        repo.insertMember(member2);

        // 회원 목록 조회
        List<Member> result = repo.selectMemberList();
        System.out.println("(4) result : " + result.size());
    }
}
