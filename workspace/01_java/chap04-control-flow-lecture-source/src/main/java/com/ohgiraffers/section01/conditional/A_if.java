package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {

        /* 수업목표. if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 한 개를 입력하세요: ");
        int input = sc.nextInt();

//        만약에(입력받은 값이 짝수면) {
//            "짝수입니다"라고 출력한다.
//        }

        if(input % 2 == 0) {
            System.out.println("짝수입니다.");
        }
    }

    public void testNestedIfStatement() {

        /* 수업목표. 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);

        System.out.print("양수 하나를 입력해 주세요: ");
        int input = sc.nextInt();
        if(input > 0) {
            if(input % 2 != 0) {
                System.out.println("입력 받은 값은 양수이면서 홀수입니다.");
            }
        }
        
        if(input > 0 && input % 2 != 0) {
            System.out.println("위와 같은 조건");
        }
    }
}
