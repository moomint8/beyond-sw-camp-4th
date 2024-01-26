package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */
        /* 설명. 내부 인터페이스인 Sum의 하위 구현체에 존재하는 메소드를 오버라이딩(feat.람다식 활용) */
        /* 설명. 람다식으로 내부 인터페이스의 하위 구현체를 변수명으로 정의함 */
        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + divide.divideTwoNumber(20, 10));
    }
}
