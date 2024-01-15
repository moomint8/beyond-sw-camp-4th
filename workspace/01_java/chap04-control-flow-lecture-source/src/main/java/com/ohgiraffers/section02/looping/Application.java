package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {
        A_for a_for = new A_for();

        /*필기. 단독 for 문 흐름 확인용 메소드 호출*/
//        a_for.testSimpleForStatement();
        /*필기. 반복문 사용하는 예제(반복문의 중요성)*/
//        a_for.testForExample1();
        /*필기. */
//        a_for.testForExample2();

        B_nestedFor bClass = new  B_nestedFor();

        /* 필기. 중첩 반복문을 사용하는 예제 */
        bClass.printGugudanFromTwoToNine();
        bClass.printUpgradeGugudanFromTwoToNine();

        /* 필기. 중첩 반복문을 활용한 별찍기 관련 예제 */
        bClass.printStars();

        /* 필기. 중첩 반복문을 활용한 마름모 찍기 예제 */
        bClass.printDiamond();
    }
}
