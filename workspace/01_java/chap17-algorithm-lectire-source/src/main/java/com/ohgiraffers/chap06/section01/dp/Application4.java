package com.ohgiraffers.chap06.section01.dp;

import java.io.*;
import java.util.StringTokenizer;

public class Application4 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);

        int n = Integer.valueOf(br.readLine());

        int dp[][] = new int[n + 1][n + 1];
        int p[][] = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                p[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        /* 설명. p배열을 통해 각 층마다 위에서 아래로 내려가며 최대값들이 누적된 dp배열 만들기 */
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {

                /* 설명. (i-1)은 윗층을 의미, (j-1)은 좌상단, (j)는 우상단에 있는 dp값을 의미한다. */
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + p[i][j];
            }
        }

        /* 설명. dp의 맨 아래층(해당 위치에 오기까지의 최대값들이 담긴 마지막 층)에서 최대값 추출하는 반복문 */
        int ans = 0;
        for (int i = 1; i <= n ; i++) {
            if(ans < dp[n][i]) ans = dp[n][i];
        }

        return ans;
    }
}
