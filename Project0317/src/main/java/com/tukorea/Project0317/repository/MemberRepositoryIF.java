package com.tukorea.Project0317.repository;

import com.tukorea.Project0317.domain.Member;

import java.util.List;

public interface MemberRepositoryIF {
    // 회원 등록
    Member insertMember(Member member);

    // 회원 아이디로 조회
    Member selectMemberById(int id);

    // 회원 이름으로 조회
    Member selectMemberByName(String name);

    // 회원 전체 목록 조회
    List<Member> selectMemberList();
}
