package com.ohgiraffers.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break aClass = new A_break();

        /* 필기. break문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleBreakStatement();

        /* 필기. vreak문을 활용한 별찍기 문제 활용 */
//        aClass.testPrintStarsWithBreakStatement();

        B_continue bClass = new B_continue();

        /* 필기. continue문 흐름 확인용 메소드 호출 */
        bClass.testSimpleContinueStatement();

    }
}
