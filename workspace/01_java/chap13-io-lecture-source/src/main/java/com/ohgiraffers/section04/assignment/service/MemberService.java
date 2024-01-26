package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 성공실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */
public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = memberRepository.selectAllMembers();

        /* 설명. 회원이 한 명도 없어서 조회 결과가 없더라도 ArrayList객체는 넘어온다.(Empty 상태로) */
        if (!selectedMembers.isEmpty()) {       // 회원이 한 명이라도 조회 되었다면
            System.out.println("==== service까지 잘 반환되어 오나 확인 ====");
            for(Member m: selectedMembers) {
                System.out.println(m);
            }
            return;
        }

        /* 설명. 조건이 맞지 않아(회원이 조회되지 않아) 출력을 하는 구문 */
        System.out.println("아직 가입한 회원이 없습니다...");
    }

    /* 설명. 전달된 회원 번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환 받기 */
    public void selectMember(int memberNo) {
        Member selectedMember = memberRepository.selectMember(memberNo);

        if (selectedMember == null) {
            System.out.println("해당 회원이 존재하지 않습니다.");
            return;
        }
        System.out.print("조회된 회원은 : " + selectedMember);
    }

    /* 설명. 입력받아 넘어온 회원이 가질 번호를 만들고 추가 후 repository로 전달 후 결과 확인 */
    public void registMember(Member member) {
//        System.out.println("사용자가 입력해서 넘겨준 Member 확인 : " + member);

        int lastNumberNo = memberRepository.selectLastMemberNo();
        member.setMemberNo(lastNumberNo + 1);

        int result = memberRepository.registMember(member);
        if (result == 1) {
            System.out.println(member.getId()+"님의 회원 가입이 성공하였습니다.");
        }
    }

    public void deleteMember(int memberNo) {
        int result = memberRepository.deleteMember(memberNo);
        if (result > 0) {
            System.out.println(memberNo + "번 회원 탈퇴를 성공하였습니다.");
            return;
        }
        System.out.println("회원 탈퇴에 실패하였습니다.");
    }
}
