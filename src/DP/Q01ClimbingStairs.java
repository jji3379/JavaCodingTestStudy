package DP;

import java.util.Scanner;

/**
 * DP 10-01
 * 계단 오르기
 */
public class Q01ClimbingStairs {
    /**
     * 한번에 1 or 2 계단씩 올라감
     * 총 경우의 수
     */
    public static int[] dy;
    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 1];
        System.out.println(solution(n));
    }
}
