package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {

        /* 수업목표. switch만 단독 사용 시 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("본인의 등급을 입력하시오(G: 골드, S: 실버, B: 브론즈)  : ");
        char grade = sc.next().charAt(0);
        int point = 0;
        boolean flag = true;

        switch(grade) {
            case 'G': point += 10;
            case 'S': point += 10;
            case 'B': point += 10;
                      break;
            default:
                flag = false;
                System.out.println("어디 회원 등급이세요?");
        }

        if(flag) {
            System.out.println("당신의 등급은 " + grade + "이며, 현재 포인트는 " + point + "입니다.");
        } else {
            System.out.println("그럼 이참에 회원 가입 하시죠!");
        }
    }
}
