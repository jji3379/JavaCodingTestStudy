package DP;

import java.util.*;

/**
 * DP 10-05
 * 동전교환 (냅색 알고리즘)
 */
public class Q05CoinExchange {
    public static int[] dy;

    public static int solution(int n, int[] arr, int m) {
        int answer = 0;
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        dy = new int[m + 1];

        System.out.println(solution(n, arr, m));
    }
}
