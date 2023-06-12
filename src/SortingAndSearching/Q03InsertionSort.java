package SortingAndSearching;

import java.util.Scanner;

/**
 * 삽입 정렬
 * 06-03
 */
public class Q03InsertionSort {
    public static int[] solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i -1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
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
 * 삽입 정렬
 * 자료들과 비교하여 삽입할 위치를 지정하여 삽입하는 정렬
 *
 * Best : O(n)
 * Avg : O(n^2)
 * Worst : O(n^2)
 */