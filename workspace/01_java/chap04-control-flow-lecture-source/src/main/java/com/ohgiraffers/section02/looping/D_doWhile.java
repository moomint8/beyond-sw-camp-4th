package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {

        /*수업목표. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        do {
            System.out.println("do ~while(false)일 때");
        } while (false);

        System.out.println("반복 종료 이후");
    }

    public void testDoWhileExample() {

        /*수업목표. do-while문의 흐름을 이해하고 적용할 수 있다.*/
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            if (!str.equals("finish") && !str.equals("")) {
                System.out.println("오타라고 믿겠습니다.");
            }
            System.out.print("finish 입력 시 종료 : ");
            str = sc.nextLine();
            System.out.println(str + "를 입력하셨군요!");
        } while (!str.equals("finish"));                //참고. 문자열 비교는 무조건 equals 사용할 것!!!!!
                                                        // str문자열 값이 finish와 일치하면 false가 되도록 작성

    }
}

