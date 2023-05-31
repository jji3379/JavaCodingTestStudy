package Array;

import java.util.Scanner;

/**
 * 격자판 최대합
 * 02-09
 */
public class Q09GridMaxSum {
    public static int solution(int[][] arr) {
        int max = 0;

        int crossSum = 0;
        int reverseCrossSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumRaw = 0; // 행 합
            int sumCol = 0; // 열 합
            for (int j = 0; j < arr.length; j++) {
                sumRaw += arr[i][j];
                sumCol += arr[j][i];
                // 대각선
                if (i == j) {
                    crossSum += arr[i][j];
                }

                // 역 대각선
                if (j == arr.length - i -1) {
                    reverseCrossSum += arr[i][j];
                }
            }

            max = Math.max(sumRaw, max);
            max = Math.max(sumCol, max);
        }

        max = Math.max(crossSum, max);
        max = Math.max(reverseCrossSum, max);

        return max;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
/**
 * 두 수 최대값 비교 : Math.max(a, b)
 */