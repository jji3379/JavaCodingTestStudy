package DFSAndBFS.Utilize;

import java.util.Scanner;

/**
 * DFS & BFS 08-04
 * 중복 순열 (DFS)
 */
public class Q04DuplicatePermutations {
    static int[] pm;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }

            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];

        DFS(0);
    }
}
