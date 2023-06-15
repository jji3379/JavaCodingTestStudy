package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난꾸러기
 * 06-06
 */
public class Q06Mischief {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        return answer;
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
 * 배열 복사
 * int[] tmp = arr.clone()
 */