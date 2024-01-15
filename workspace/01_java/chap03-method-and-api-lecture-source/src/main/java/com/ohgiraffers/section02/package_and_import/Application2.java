package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */

        /* 목차. 1. non-static method의 경우 */
        Calculator cal = new Calculator();      // import를 활용해 줄여쓴 Calculator
        int sub = cal.subTwoNumbers(80, 21);
        System.out.println("80 - 21 = " + sub);

        /* 목차. 2. static method의 경우 */
        System.out.println("두 수중 큰 값은: " + Calculator.maxNumberOf(22, 80));
    }
}
