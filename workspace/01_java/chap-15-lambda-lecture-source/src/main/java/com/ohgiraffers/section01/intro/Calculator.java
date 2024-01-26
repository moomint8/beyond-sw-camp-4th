package com.ohgiraffers.section01.intro;

@FunctionalInterface
public interface Calculator {
    int sumTwoNumber(int firstNum, int secondNum);
//    int sumTwoNumber2(int firstNum, int secondNum);     // FunctionalInterface는 추상메소드가 하나여야 한다.
}
