package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println("============== find all members ==============");

        /* 설명. findAllMembers() 호출 이후 AfterReturning Advice가 회원 한 명을 추가하니 아래 예외 테스트시에는 주석할 것 */
        List<MemberDTO> members = memberService.findAllMembers();
        members.forEach(System.out::println);

        System.out.println("============== find one members ==============");
        System.out.println(memberService.findMemberBy(1));

        /* 설명. 2번 인덱스에 해당하는 회원 조회(AfterThrowing Advice 확인용) (2번 인덱스 회원은 없음(회원이 2명이므로)) */
//        System.out.println(memberService.findMemberBy(2));

        /* 설명. */
    }
}
