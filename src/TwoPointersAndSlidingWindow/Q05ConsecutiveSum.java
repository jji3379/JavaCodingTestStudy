package TwoPointersAndSlidingWindow;

import java.util.Scanner;

/**
 * 03-05
 * 연속된 자연수의 합
 */
public class Q05ConsecutiveSum {
    public static int solution(int n) {
        int answer = 0;
        int lt = 0;
        // 연속 2개 더해서 해당 값 까지 나와야 하기에 n/2 + 1
        int[] arr = new int[n/2 + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int sum = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(solution(n));
    }
}
