package Array;

import java.util.*;
import java.util.stream.IntStream;

/**
 * 등수 구하기
 * 02-08
 */
public class Q08Rank {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    answer[i]++;
                }
            }
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

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }

    }
}
