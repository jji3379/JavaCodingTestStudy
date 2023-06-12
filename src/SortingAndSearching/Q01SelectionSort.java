package SortingAndSearching;

import java.util.Scanner;

/**
 * 선택 정렬
 * 06-01
 */
public class Q01SelectionSort {
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
/**
 * 선택 정렬
 * 가장 작은 수를 현재의 값과 바꾸는 방법
 *
 * 2중 for 문
 * Best : O(n^2)
 * Avg : O(n^2)
 * Worst : O(n^2)
 */
