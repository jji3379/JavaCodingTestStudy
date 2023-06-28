package Graph;

import java.util.Scanner;

/**
 * Graph 07-12
 * 경로탐색 (인접행렬 - DFS - 백트래킹)
 */
public class Q01PathSearchAdjacencyMatrix {
    static int n;
    static int m;
    static int answer;
    static int[][] graph;
    static int[] ch;

    public static void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) { // 갈 수 있는지 확인
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백 트래킹 (재귀 돌면 스택프레임에 의해 이 자리로 돌아오므로 체크된 부분을 취소해준다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
