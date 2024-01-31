package com.ogiraffers.chap01.section01.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    /* 수업목표. 버블정렬을 이해할 수 있다. */
    /* 필기.
     *  정렬 알고리즘
     *   데이터를 특정 순서대로 배열하는데 사용한다.(일반적으로는 배열의 정렬을 뜻함(코딩테스트 기준))
     *
     * 필기.
     *  버블 정렬(Bubble Sort)
     *   두 인접한 데이터의 크기를 비교해 정렬하는 방법이다.
     *   버블의 모든 요소에 대해 반복하면서, 각 반복마다 가장 큰 요소가 배열의 끝으로 "버블링(이동)" 된다.
     *   시간 복잡도는 O(n^2)이라 효율적이지는 않다.
     */


    public static void main(String[] args) {

        /* 설명.
         *  문제 내용
         *   : N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
         *  입력
         *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
         *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
         *  출력
         *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
         *
         *  설명.
         *   예시 입력 1
         *     - 7
         *       34 23 5 24 1 9 12
         *   예시 출력 1
         *     - 1 5 9 12 23 24 34
         *
         *  설명.
         *   예시 입력 2
         *     - 6
         *       40 47 38 8 33 35
         *   예시 출력 2
         *     - 8 33 35 38 40 47
         * */

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
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
//                System.out.println(Arrays.toString(arr));
            }
        }

//        for (int i = 0; i < length - 1; i++) {
//            for (int j = 0; j < length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//                System.out.println(Arrays.toString(arr));
//            }
//        }
    }
}
