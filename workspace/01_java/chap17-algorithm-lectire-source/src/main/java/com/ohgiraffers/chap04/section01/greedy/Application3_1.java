package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3_1 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        int max_count = 0;

        BufferedReader br = toBufferedReader(input);
        int N = Integer.valueOf(br.readLine());       // 회의 수
        int[][] time = new int[N][2];                 // (회의 갯수 * (시작시간 + 종료시간) 일차원 배열)인 이차원 배열
        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            time[i][0] = Integer.valueOf(str.nextToken());      // 시작 시간
            time[i][1] = Integer.valueOf(str.nextToken());      // 종료 시간
        }

        /* 설명.
         *  그리디 알고리즘으로 접근하자면 하나의 회의실에서 가장 많은 회의를 열기 위해서는
         *  종료시간 순(오름차순)으로 고민하는 것이 좋다.
         *  (빨리 끝나는 회의를 먼저 고려하는 것이 좋다.)
        * */
        Arrays.sort(time, (o1, o2) -> {

           /* 설명. 종료시간이 같은 회의에 대해서는 */
           if(o1[1] == o2[1]) {

               /* 설명. 시작 시간이 늦은 순서로(내림차순) 정렬 기준을 잡는다.(회의 시간이 짧아지는 순서로 쌓기 위함) */
               return o2[0] - o1[0];
           }

           /* 설명. 종료시간이 같지 않을 때는 종료 시간이 이름 회의부터 정렬되도록 기준을 잡는다.(종료시간 오름차순) */
           return o1[1] - o2[1];
        });

        /* 설명. 앞선 회의가 끝나는 시간을 담아놓을 변수 선언 */
        int end = 0;

        /* 설명. time 배열에 담긴 회의들을 확인하며 앞선 회의의 종료 다음 회의가 진행되는지를 판별해 가능한 회의 추출 */
        for (int i = 0; i < N; i++) {

            /* 설명. 앞선 회의가 끝나는 시간과 일치하거나 이후에 시작하는 회의 인가 */
            if(end <= time[i][0]) {

                /* 설명. 조건을 만족하는 회의의 종료 시간으로 end 변수를 갱신 */
                end = time[i][1];
                max_count++;
            }
        }

        return max_count;
    }
}
