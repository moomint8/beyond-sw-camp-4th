package com.ohgiraffers.section01.conditional;

/* 설명. 이제부터 실행용 클래스를 구분해서 사용한다.(main 메소드는 여기에만 포함) */
public class Application {
    public static void main(String[] args) {

        A_if aClass = new A_if();

        /* 필기. 단독 if문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleIfStatement();

        /* 필기. 중첩 if문 흐름 확인용 메소드 호출 */
//        aClass.testNestedIfStatement();

        B_ifElse bClass = new B_ifElse();

        /* 필기. 단독 if-else문 흐름 확인용 메소드 호출 */
//        bClass.testSimpleIfElseStatement();

        /* 필기. 중첩 if-else문 흐름 확인용 메소드 호출 */
//        bClass.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();

        /* 필기. 단독 if-else-if문 흐름 확인용 메소드 호출 */
//        cClass.testSimpleIfElseIfStatement();

        /* 필기. 중첩 if-else-if문 흐름 확인용 메소드 호출 */
        /* 필기. 중첩 if-else-if문 로직 개선 */
//        cClass.testNestedIfElseIfStatement();

        D_switch dClass = new D_switch();

        /* 필기. switch문 흐름 확인용 메소드 호출 */
        dClass.testSimpleSwitchStatement();

    }
}
