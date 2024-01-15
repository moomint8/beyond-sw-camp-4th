package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *  비교연산자
         *  비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
         *  연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건식에서 많이
         *  사용된다.(충분히 연습하는 것이 좋다.)
        * */

        /* 목차. 1. 숫자값 비교 */
        int inum1 = 10;
        int inum2 = 20;
//        System.out.println(inum1 == inum2);
//        System.out.println(inum1 != inum2);
//        System.out.println(inum1 > inum2);
//        System.out.println(inum1 >= inum2);
//        System.out.println(inum1 < inum2);
//        System.out.println(inum1 <= inum2);

        /* 목차. 2. 문자값 비교 */
        char ch1 = 'a';         // 97
        char ch2 = 'A';         // 65
//        System.out.println((int)ch2);         // 컴퓨터가 인지하는 문자의 유니코드 값 확인하기
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 <= ch2);

        /* 목차. 3. 논리값 비교 */
        boolean isNumber1 = true;
        boolean isNumber2 = false;
        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber1 != isNumber2);
//        System.out.println(isNumber1 > isNumber2);
//        System.out.println(isNumber1 >= isNumber2);
//        System.out.println(isNumber1 < isNumber2);
//        System.out.println(isNumber1 <= isNumber2);

        /* 목차. 4. 문자열값 비교 */
        String str3 = "java";
        String str4 = "java";
        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
//        System.out.println(str3 > str4);
//        System.out.println(str3 >= str4);
//        System.out.println(str3 < str4);
//        System.out.println(str3 <= str4);

    }
}
