package com.ogiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.StringTokenizer;

/* 수업목표. DFS를 활용(재귀함수)하는 예제를 이해할 수 있다. */
/* 필기.
 *  깊이 우선 탐색(Dept-First Search)
 *  후입선출 구조인 stack 또는 재귀함수를 활용한다.
 *  한 쪽 분기를 정하여 최대 깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여
 *  다시 탐색을 수행하는 알고리즘이다.
 */
public class Application1 {
    static boolean[] visit;
    static int[][] map;
    static int count = 0;
    static int node, edge;

    /* 설명. 테스트 코드에서 입력 받는 방식을 문제에서 요구하는 대로작성하고 문자열로 입력받기 위해 변경된 코드 */
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. 문제에서 요구하는 입력 값을 받아 감염된 컴퓨터의 갯수(int/Integer)를 반환하는 메소드 작성 */
    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.valueOf(br.readLine());
        edge = Integer.valueOf(br.readLine());

        /* 설명. 노드와 간선에 대한 정보가 담길 map을 작성(node의 갯수에 기반한 int형 2차원 배열) */
        map = new int[node + 1][node + 1];  // node의 번호와 인덱스 위치를 일치시키기 위해서 크기를 1 증가(0번 인덱스는 사용 안함)

        /* 설명. 방문 배열 작성(방문 배열을 작성하는 이유는 방문했던 노드를 다시 stack에 담지 않거나 다시 재귀 함수 호출을 하지 않기 위함) */
        visit = new boolean[node + 1];      // 방문 배열도 노드 번호와 인덱스 번호를 일치시키기 위해서 1 증가

        /* 설명. 인접리스트(map)로 그래프에 대한 정보 작성 */
        for (int i = 0; i < edge; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.valueOf(str.nextToken());
            int b = Integer.valueOf(str.nextToken());

            /* 설명. 무방향 그래프로 처리되기 위해 노드 번호들(인덱스 번호)을 반대로도 적용한다. */
//            map[a][b] = 1;
//            map[b][a] = 1;
            map[a][b] = map[b][a] = 1;
        }

        /* 설명. dfs 그래프 탐색 기법으로 1번 노드부터 1번 노드와 관련된 모든 노드들을 카운팅하는 메소드 호출 */
        dfs(1);

        return count - 1;       // 1번 컴퓨터의 경우를 제외하기 위해 -1
    }

    /* 설명. 재귀 함수로 dfs 알고리즘을 구현할 메소드 */
    private static void dfs(int start) {
        visit[start] = true;
        count++;

        /* 설명. 넘어온 노드와 연관된 노드를 찾는 반복문(기존에 방문하지 않았던) */
        for (int i = 0; i <= node; i++) {
            if (map[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
