package HashAndTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * K 번째 큰 수
 * 04-05
 */
public class Q05KthLargestNumber {
    public static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    set.add(sum);
                }
            }
        }

        int cnt = 0;

        for (int x : set) {
            cnt ++;
            if (cnt == k) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
/**
 * TreeSet => 중복 제거 + 정렬 된 것
 *
 * 내림차순
 * TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
 */