package com.ohgiraffers.section01.method;

public class Application3 {

    static int global = 10;                                 // 전역변수이자 클래스 변수

    public static void main(String[] args) {


        int global = 20;                                  // 지역변수
        System.out.println("global 출력: " + global);
        System.out.println("global 출력: " + Application3.global);        // 클래스명.변수명을 하면 클래스 변수를 호출할 수 있다.

        /* 수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다. */
        /* 필기.
         *  전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         *  지금까지 우리가 배운 변수는 지역변수에 해당한다.
        * */

        /* 필기.
         *  변수의 종류(자료형과는 다른 구분방식)
         *   1. 지역변수
         *   2. 매개변수
         *   3. 전역변수(필드)
         *   4. 클래스(static)변수
        * */

        Application3 app3 = new Application3();
        app3.testMethod(10);                    // 10은 전달인자이다.
        app3.testMethod(19);
        app3.testMethod(15);
        app3.testMethod('a');
        app3.testMethod((int)12.34);
        app3.testMethod(3 * 2);
    }

    /* 설명. 정수를 주면 나이를 출력해주는 기능을 가진 메소드(non-static) */
    public void testMethod(int age) {               // int age는 전달인자를 받는 지역변수인 매개변수이다.
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
