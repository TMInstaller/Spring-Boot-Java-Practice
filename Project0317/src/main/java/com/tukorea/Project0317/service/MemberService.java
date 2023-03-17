package com.tukorea.Project0317.service;

import com.tukorea.Project0317.domain.Member;
import com.tukorea.Project0317.repository.MemberRepositoryIF;
import com.tukorea.Project0317.repository.MemoryMemberRepository;

import java.util.List;

public class MemberService {
    private final MemberRepositoryIF repo;
    public MemberService(MemberRepositoryIF repo){
        this.repo = repo;
    }
    public int join(Member member){
        // 회원가입 서비스 메서드 구현
        // 같은 이름의 회원은 가입 불가
        Member cMember = repo.selectMemberByName(member.getName());
        if (cMember != null) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }

        // 회원 가입 진행
        repo.insertMember(member);
        return member.getId();
    }

    public List<Member> getMemberList() {
        // 회원 목록 조회 서비스 메서드 구현
        return repo.selectMemberList();
    }

    public Member getMemberById(int id) {
        // 아이디로 회원 정보 조회 서비스 메서드 구현
        Member result = repo.selectMemberById(id);
        return result;
    }
}
