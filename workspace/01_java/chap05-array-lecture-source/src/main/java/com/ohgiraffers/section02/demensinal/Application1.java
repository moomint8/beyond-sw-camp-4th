package com.ohgiraffers.section02.demensinal;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 필기.
         *  다차원 배열
         *   다차원 배열은 2차원 이상의 배열을 의미한다.(일반적으로는 사람의 인지 범위에 맞게 최대 3차원 정도를 고려한다.)
         */

        int[][] iArr1;
        int[] iArr2[];      // 가능은 하나 추천 X
        int iArr3[][];      // 가능은 하나 추천 X

        iArr1 = new int[3][2];      // 정변 배열을 위한 선언 방식(관리하는 1차원 배열의 길이가 동일)
        iArr2 = new int[3][];       // 가변 배열을 위한 선언 방식(관리하는 1차원 배열의 길이가 다를 시)
//        iArr3 = new int[][];      // 컴파일 에러 발생

        /* 설명. 졍변 배열은 이미 1차원 배열들이 생성되어 지정되어 있다. */
        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {                // 1차원 배열을 고르는 for문
            for (int j = 0; j < iArr1[i].length; j++) {         // 선택된 1차원 배열의 길이만큼 반복하는 for문
                iArr1[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr1[i]));
        }

        /* 설명. 가변 배열은 아직 1차원 배열들이 생성되어 있지 않다.(NullPointerExcetion 발생 가능) */
        int length = 1;
        for (int i = 0; i < iArr2.length; i++) {                // 1차원 배열을 고르는 for문
            iArr2[i] = new int[++length];
            for (int j = 0; j < iArr2[i].length; j++) {         // 선택된 1차원 배열의 길이만큼 반복하는 for문
                iArr2[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr2[i]));
        }

    }
}
