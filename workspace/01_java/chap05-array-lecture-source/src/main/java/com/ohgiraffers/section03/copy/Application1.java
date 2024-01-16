package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  배열의 복사에는 크게 두 가지 개념이 있다.
         *  1. 얕은 복사(shallow copy) : stack의 주소값만 복사
         *  2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사
         */

        int[] orginArr = {1, 2, 3};
        int[] copyArr = orginArr;

        System.out.println(Arrays.toString(copyArr));

        copyArr[2] = 100;
        System.out.println(Arrays.toString(orginArr));
    }
}
