package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다. */

        int first = 100;
        int second = 50;

        /* 설명. non-static 메소드 호출하기 */
        Calculator cal = new Calculator();
        System.out.println("두 수의 합: " + cal.plusTwoNumbers(first, second));

        /* 설명. private와 같이 접근 제어자에 따라 다른 클래스에서 접근이 불가능한 메소드가 있을 수 있다. */
//        System.out.println("두 수 중 작은 값은: " + cal.minNumberOf(first, second));

        /* 설명. static 메소드는 클래스명.을 붙여 호출한다. */
        System.out.println("두 수 중 큰 값은: " + Calculator.maxNumberOf(first, second));

    }
}
