package DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * DFS 07-08
 * 송아지 찾기 1 (BFS : 상태트리탐색)
 */
public class Q04FindCalf {
    public static int BFS(int s, int e) {
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];

        Queue<Integer> q = new LinkedList<>();

        ch[s] = 1;
        q.offer(s);
        int L = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) {
                        return L + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();

        System.out.println(BFS(s, e));
    }
}
/**
 * 최단거리를 찾을 때 BFS 레벨을 찾으면 된다.
 */