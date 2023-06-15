package SortingAndSearching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 중복 확인
 * 06-05
 */
public class Q05DoubleCheck {
    public static String solution(int[] arr) {
        String answer = "U";

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x)) {
                return "D";
            } else {
                map.put(x, 1);
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

        System.out.println(solution(arr));
    }
}
