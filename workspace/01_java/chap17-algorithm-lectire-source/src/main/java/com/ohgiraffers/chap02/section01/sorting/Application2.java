package com.ohgiraffers.chap02.section01.sorting;

/* 수업목표. 선택 정렬을 이해할 수 있다. */
/* 필기.
 *  선택 정렬(Selection Sort)
 *   대상 데이터에서 최대나 최소 데이터를 찾아 맨 앞(또는 맨 뒤)와 교환하는 방법이다.
 *   배열의 모든 요소에 대해 반복한다.
 *   시간 복잡도는 O(n^2)이라 효율적이지 않다.
 */

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 설명. 입력 데이터 받기 */
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();         // 공백을 구분자로 하여 하나씩 입력됨
        }

        /* 설명. 알고리즘 실행 */
        solution(length, arr);

        /* 설명. 정렬 결과 출력하기 */
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void solution(int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
//            System.out.println(Arrays.toString(arr));
        }
    }
}
