package com.ohgiraffers.section08.uses;

public class MemberRepository {

    /* 설명. static 변수인 Member객체 배열은 데이터베이스라고 생각하자. */
    private final static Member[] members;

    /* 설명. 현재 가입되어 있는 회원 수이자 마지막 회원 번호 +1을 의미한다.(데이터베이스의 auto_increment 같은 개념이다.) */
    private static int count;

    static {
        members = new Member[10];               // 관리할 회원은 총 10명이 되게 크기가 10인 배열 선언
    }

    /* 설명. 데이터베이스 개념인 Member 객체 배열에 넘어온 회원 가입용 회원 객체들을 한명씩 추가 */
    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }

        return true;
    }

    /* 설명. 데이터 베이스의 개념에서부터 조회하는 기능 */
    public static Member[] findAllMembers() {

        return members;
    }
}
