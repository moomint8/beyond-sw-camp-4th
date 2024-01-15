package com.ohgiraffers.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 산술연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *  산술 연산자
         *   산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
         *   연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
         *   피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));

        double testNum = (num1 / (double) num2);
        double resultNum = (int)(testNum * 100)/(double)100;            // 소수 셋째자리부터 버림을 형변환으로 해보기
//        System.out.println("num1 / num2 = " + (num1 / (double)num2));
        System.out.println("resultNum = " + resultNum);
        System.out.println("num1 % num2 = " + (num1 % num2));

    }
}
