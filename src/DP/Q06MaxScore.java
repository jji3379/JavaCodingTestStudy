package DP;

import java.util.Scanner;

/**
 * DP 10-06
 * 최대점수 구하기 (냅색 알고리즘)
 */
public class Q06MaxScore {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int score = kb.nextInt();
            int solveTime = kb.nextInt();

            for (int j = m; j >= solveTime; j--) {
                dy[j] = Math.max(dy[j], dy[j - solveTime] + score);
            }
        }

        System.out.println(dy[m]);
    }
}
