package DFSAndBFS.Utilize;

import java.util.Scanner;

/**
 * DFS & BFS 08-02
 * 바둑이 승차(DFS)
 */
public class Q02DFSGoRiding {
    static int n;
    static int c;
    static int answer = Integer.MIN_VALUE;
    public static void DFS(int L, int sum, int[] arr) {
        if (sum > c) {
            return;
        }

        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
