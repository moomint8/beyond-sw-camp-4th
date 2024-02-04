package com.ogiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 방문 배열을 활용한 최단거리 문제를 해결할 수 있다. */
public class Application3 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static boolean[][] visit;
    static int[][] map;

    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};

    static int N, M;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());

        map = new int[N][M];
        visit = new boolean[N][M];

        /* 설명. 입력 값이 공백 없이 이어서 들어옮에 따라 한 문자씩 뜯어서 int 배열(map)에 옮겨담는 반복문 */
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();

            for (int j = 0; j < ch.length; j++) {
                map[i][j] = Character.getNumericValue(ch[j]);
            }
        }

        visit[0][0] = true;
        bfs(0, 0);

        return map[N - 1][M - 1];
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));          // offer 대신 add도 된다.

        while (!q.isEmpty()) {
            Node n = q.poll();

            /* 설명. 상하좌우를 둘러보는 개념의 for문(벽이 있는지, 지나온 길인지 확인) */
            for (int i = 0; i < 4; i++) {
                int curX = n.x + dirX[i];
                int curY = n.y + dirY[i];

                /* 설명. 지금 보는 좌표가 전체 범위를 벗어난 경우 */
                if (curX < 0 || curY < 0 || curX >= N || curY >= M) {
                    continue;
                }

                /* 설명. 방문을 했던 좌표거나 벽이라면 */
                if (visit[curX][curY] || map[curX][curY] == 0) {
                    continue;
                }

                /* 설명. 가야될 방향의 좌표(Node)를 queue에 쌓는다. */
                q.add(new Node((curX), curY));
                map[curX][curY] = map[n.x][n.y] + 1;
                visit[curX][curY] = true;
            }
        }
    }
}
