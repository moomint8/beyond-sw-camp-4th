package com.ohgiraffers.section01.method;

public class Calculator {

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int subTwoNumbers(int first, int second) {
        return first - second;
    }

    public int multiTwoNumbers(int first, int second) {
        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {
        return first / second;
    }

    private int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }
}
