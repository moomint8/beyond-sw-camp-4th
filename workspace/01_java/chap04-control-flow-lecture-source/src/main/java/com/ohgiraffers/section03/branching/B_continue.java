package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /* 수업목표. continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기. continue문 또한 반복문 안에서 사용한다. continue 구문 이후 반복할 내용을 건너뛰고 다음 스텝으로 넘어간다. */

        /* 설명. 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력(4와 5의 공배수 출력) */
        for (int i = 1; i <= 100; i++) {
            if ((i % 4 != 0) || (i % 5 != 0)) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
