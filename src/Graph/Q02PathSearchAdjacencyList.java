package Graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Graph 07-13
 * 경로탐색 (인접리스트)
 */
public class Q02PathSearchAdjacencyList {
    static int n;
    static int m;
    static int answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        // 객체 생성
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
/**
 * 정점이 1000, 10000 개 들어올 경우에는 인접행렬로 풀기에는 부적절하다.
 * 인접 리스트로 풀어야한다.
 */