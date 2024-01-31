package com.ogiraffers.chap01.section01.sorting;

import java.util.Scanner;

/* 수업목표. 퀵 정렬을 이해할 수 있다. */
/* 필기.
 *  퀵 정렬(Quick Sort)
 *   기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해서 정렬하는 것으로
 *   병합 알고리즘과 함께 실제 정렬 알고리즘으로 많이 활용되고 있다.
 *   시간 복잡도는 O(n log n)이지만 최악의 경우는 O(n^2)이다.
 */
public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(0, arr.length - 1, arr);

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void solution(int low, int high, int[] arr) {
        if (low >= high) {
            return;
        }

        System.out.println("---- process call start----");
        int pivot = process(low, high, arr);
        System.out.println("low = " + low + "   high : " + high + "   pivot : " + pivot);
        System.out.println("---- process call end ----");

        solution(low, pivot, arr);
        solution(pivot + 1, high, arr);
    }

    /* 설명. low에 해당하는 포인터와 high에 해당하는 포인터를 최대한 움직여 pivot을 반환하는 메소드 */
    private static int process(int left, int right, int[] arr) {
        int low = left - 1;
        int high = right + 1;
        int pivot = arr[(left + right) / 2];

        while (true) {

            /* 설명. pivot 위치에 있는 값보다 작은 값을 가리키면 low 포인터를 증가한다. */
            do {
                low++;
            } while (arr[low] < pivot);

            /* 설명. pivot 위치에 있는 값보다 크면서 low 포인터의 위치보다 크거나 같은 위치면 감소한다. */
            do {
                high--;
            } while (arr[high] > pivot && low <= high);

            /* 설명. low 포인터의 위치가 high 포인터를 앞지르려고 하면 high를 반환한다.(분할 기준 반환) */
            if (low >= high) {
                return high;
            }

            swap(arr, low, high);
        }
    }


    /* 설명. 전달된 배열과 인덱스들을 바탕으로 위치를 바꾸는 메소드 */
    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
