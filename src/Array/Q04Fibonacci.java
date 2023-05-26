package Array;

import java.util.Scanner;

/**
 * 피보나치 수열
 * 02-04
 */
public class Q04Fibonacci {
    public static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        // O(n)
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.print(solution(n)[i] + " ");
        }
    }
}
