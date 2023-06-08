package TwoPointersAndSlidingWindow;

import java.util.Scanner;

/**
 * 최대 매출
 * 03-03
 */
public class MaxTurnover {
    public static int solution(int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i-k] + arr[i];

            answer = Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(k, arr));
    }
}
/**
 * SlidingWindow
 * 연속 되는 숫자들을 옆으로 한칸씩 미루는 것
 * 방법
 * 1. 초기 윈도우 세팅
 * 2. sum = sum - arr[i-k] + arr[i];
 */