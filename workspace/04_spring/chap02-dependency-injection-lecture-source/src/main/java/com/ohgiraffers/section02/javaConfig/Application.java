package com.ohgiraffers.section02.javaConfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean(MemberDTO.class);

        /* 설명. 컨테이너가 관리중인 MemberDTO타입의 은행코드 20번인 PersonalAccount 객체가 주입되어 있음을 확인 */
        System.out.println(member.getPersnalAccount());

        /* 설명. member bean이 가진 계좌 객체의 기능을 활용해 입금 및 출금을 진행해보자. */
        System.out.println(member.getPersnalAccount().depository(20000));

        System.out.println(member.getPersnalAccount().getBalance());

        System.out.println(member.getPersnalAccount().withDraw(7000));

        System.out.println(member.getPersnalAccount().getBalance());
    }
}
