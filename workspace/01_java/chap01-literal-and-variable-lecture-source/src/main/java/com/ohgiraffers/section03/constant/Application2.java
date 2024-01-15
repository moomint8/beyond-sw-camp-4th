package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 상수의 명명 규칙에 대해 이해할 수 있다. */

        /* 목차. 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.(특수기호 X) */
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;            // 소문자로 사용은 가능하나 변수와 구분하기 힘들기 때문에 지양된다.

        /* 목차. 2. 단어와 단어 연결은 언더스코어(_)를 사용한다. */
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30;          // 낙타봉 표기법 역시 사용은 가능하나 변수와 구분하기 힘들기 때문에 지양된다.
    }
}
