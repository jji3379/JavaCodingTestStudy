package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
 * 05-03
 */
public class Q03CranePuppet {
    public static int solution(int[][] arr, int[] moves) {
        int answer = 0;

        // bucket
        Stack<Integer> bucket = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][pos - 1] != 0) {
                    int tmp = arr[i][pos - 1];
                    arr[i][pos - 1] = 0;

                    if (!bucket.isEmpty() && tmp == bucket.peek()) {
                        answer += 2;
                        bucket.pop();
                    } else {
                        bucket.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int m = kb.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(solution(arr, moves));
    }
}
