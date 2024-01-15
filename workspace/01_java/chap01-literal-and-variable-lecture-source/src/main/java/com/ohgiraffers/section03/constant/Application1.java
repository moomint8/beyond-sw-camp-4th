package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */

        /* 목차. 1. 상수 선언 */
        final int AGE;

        /* 목차. 2. 초기화 */
        AGE = 20;
//        AGE = 21;

        /* 목차. 3. 필요한 위치에 상수를 호출해서 사용 */
        System.out.println("AGE의 값: " + AGE);

        /* 설명. 상수값도 리터럴로 치환된다. */
        int myAge = AGE;

    }
}
