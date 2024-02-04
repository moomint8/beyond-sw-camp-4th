package com.ohgiraffers.chap06.section01.dp;

import java.io.*;

public class Application5 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);

        int n = Integer.valueOf(br.readLine());

        int[] dp = new int[n + 1];          // dp 배열(최적의 값이 누적)
        int[] arr = new int[n + 1];         // 계단마다의 점수

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        dp[1] = arr[1];

        if(n >= 2) {
            dp[2] = dp[1] + arr[2];
        }

        /* 설명. 점화식은 3번 계단부터 적용(dp[i - 3]의 개념은 연달아 세번 밟을 수 없기 때문에 존재) */
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }

        return dp[n];
    }
}
