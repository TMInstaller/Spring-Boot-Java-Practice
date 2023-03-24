package com.tukorea.Project0317.repository;

import com.tukorea.Project0317.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepositoryIF{
    private static Map<Integer, Member> store = new HashMap<>();
    private static int sequence = 0;

    @Override
    public Member insertMember(Member member) {
        // 회원 정보 등록 구현 메소드
        // member id 설정
        member.setId(++sequence);
        // store 객체에 member 정보 추가
        store.put(member.getId(), member);
        return member;
    }
    @Override
    public Member selectMemberById(int id) {
        // 아이디로 회원 정보 조회 구현 메소드
        // id key 값을 이용하여 store 객체에서 정보 꺼내기
        return store.get(id);
    }
    @Override
    public Member selectMemberByName(String name) {
        // 이름으로 회원 정보 조회 구현 메소드
        Member result = null;

        Iterator<Integer> keys = store.keySet().iterator();
        while (keys.hasNext()) {
            Member tMember = store.get(keys.next());
            if (name.equals(tMember.getName())) {
                result = tMember;
            }
        }
        return result;
    }
    @Override
    public List<Member> selectMemberList(){
        // 회원 목록 전체 조회(selectMemberList) 메소드 구현
        // store 객체를 List 형태로 변환하여 return
        return new ArrayList<>(store.values());
    }

    public void clearStorage() {
        // store 객체 비움 구현 메소드
        // sequence 초기화
        sequence = 0;

        // store 객체 비우기
        store.clear();
    }
}
