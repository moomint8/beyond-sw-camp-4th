package com.ohgiraffers.chap04.section01.greedy;

/* 수업목표. 그리디(Greedy) 알고리즘에 대해 이해할 수 있다. */
/* 필기.
 *  현재 상태에서 최적의 해답(최대 이익을 주는 해답)을 찾기 위해 적용하는 알고리즘으로 앞의 선택이
 *  이후에 영향을 주지 않을 때 적용 가능하다.
* */
public class Application1 {
    public static int solution(int n) {
        int count = 0;          // 들고 갈 최소 봉지 갯수

        while(true) {

            /* 설명. 5킬로그램 봉지로 바로 나눌 수 있으면 n/5를 반환한다. */
            if(n % 5 == 0) {
                return n / 5 + count;           // (+ count)의 개념은 이전 반복에서 가져간 3킬로그램 봉지의 수이다.
            } else if (n < 0) {
                return -1;
            }

            /* 설명. 3킬로그램 봉지로 한 봉지 들고 간다. */
            n = n - 3;
            count++;
        }
    }

}
