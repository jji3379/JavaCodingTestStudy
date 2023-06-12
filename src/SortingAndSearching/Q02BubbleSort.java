package SortingAndSearching;

import java.util.Scanner;

/**
 * 버블 정렬
 * 06-02
 */
public class Q02BubbleSort {
    public static int[] solution(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
/**
 * 버블 정렬
 * 옆에 값과 비교해서 가장 큰 수를 오른쪽으로 넘기는 정렬 방법
 *
 * 2중 for 문
 * Best : O(n^2)
 * Avg : O(n^2)
 * Worst : O(n^2)
 */