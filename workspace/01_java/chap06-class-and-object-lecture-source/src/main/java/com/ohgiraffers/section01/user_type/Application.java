package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */
        /* 설명.
         *  회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 취급하여 관리하려고 한다.
         *  이 자료를 취급할 수 있는 방법을 생각해보자.
         */

        /* 목차. 1. 변수를 이용한 회원 데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " + Arrays.toString(hobby));

        /* 필기.
         *  이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
         *  1. 많은 변수명들을 관리하기 힘들 수 있다.
         *  2. 메소드의 전달인자로 전달 할 값이 너무 많아 회원과 관련된 기능을 호출할 때 매개변수가 많아진다.(냄새나는 코드)
         *  3. 메소드의 반환형으로 회원이라는 개념을 반환할 수 없다.(메소드의 반환형은 하나여야 하기 때문에)
         */

        Member member1 = new Member();
        Member member2 = new Member();
        System.out.println(member1.name);
        System.out.println(member2.name);


        member1.name = "김철수";
        member2.name = "김영희";
        System.out.println(member1.name);
        System.out.println(member2.name);

        /* 설명. 김철수씨만 완성해보자 */
        member1.age = 30;
        member1.gender = '남';
        member1.hobby = new String[]{"볼링", "하키"};
        member1.id = "user03";
        member1.pwd = "pwd03";

        /* 설명. 회원 정보를 하나의 전달인자로 전달하고 하나의 매개변수로 받을 수 있다. */
        /* 설명. 또한 메소드의 반환형으로 한 번에 회원 정보를 반환할 수 있고, 반환 받은 곳에서 반환된 객체에 접근도 가능하다. */
        System.out.println(printMember(member1).name);

        Member renameMember = printMember(member1);
        System.out.println(renameMember.age);
        System.out.println(Arrays.toString(member1.hobby));
    }

    private static Member printMember(Member member) {
        System.out.println(member.name + "의 개명을 시작합니다.");
        member.name = "박길동";

        return member;
    }
}
