package DP;

import java.util.Scanner;

/**
 * DP 10-02
 * 돌다리 건너기
 */
public class Q02CrossTheStoneBridge {
    public static int[] dy;
    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n+1];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 2];
        System.out.println(solution(n));
    }
}