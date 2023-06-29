package DFSAndBFS.Utilize;

import java.util.Scanner;

/**
 * DFS & BFS 08-09
 * 조합 구하기
 */
public class Q09FindCombinations {
    static int[] combi;
    static int n, m;

    public static void DFS(int L, int s) {
        if (L == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }
}
