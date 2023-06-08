package TwoPointersAndSlidingWindow;

import java.util.Scanner;

/**
 * 연속 부분수열
 * 03-04
 */
public class Q04ContinuosSubsequence {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt];
                lt++;

                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
/**
 * lt, rt 나눠서 진행
 * 1. 합이 기준보다 높을 때까지 rt 증가
 * 2. 기준보다 같거나 높으면 lt 값 빼고 lt 증가
 */