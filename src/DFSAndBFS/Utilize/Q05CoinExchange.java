package DFSAndBFS.Utilize;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * DFS & BFS 08-05
 * 동전 교환 (DFS)
 */
public class Q05CoinExchange {

    static int n, m;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }

        if (L >= answer) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        m = kb.nextInt();

        DFS(0, 0, arr);

        System.out.println(answer);
    }
}
