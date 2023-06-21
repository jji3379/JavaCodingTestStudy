package DP;

import java.util.Scanner;

/**
 * DP 10-03
 * 최대 부분 증가수열
 */
public class Q03LargestSubIncrementSequence {
    public static int[] dy;
    public static int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(arr));
    }
}
