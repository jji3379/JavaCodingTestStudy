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

    /**
     * 수학을 활용한 방법
     * 비교하는 값에 연속된 수를 빼고, 그 값을 연속된 수로 나눴을 때 나머지가 0이면 만족한다.
     * ex) n = 15, cnt = 2 (1, 2)
     * 15 - (1 + 2) = 12
     * 12 / 2 = 6
     * (1+6, 2+6) = (7,8)
     */
    public static int mathSolution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
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
/**
 * 수학을 활용한 방법
 * 비교하는 값에 연속된 수를 빼고, 그 값을 연속된 수로 나눴을 때 나머지가 0이면 만족한다.
 * ex1) n = 15, cnt = 2 (1, 2)
 * 15 - (1 + 2) = 12
 * 12 / 2 = 6
 * (1+6, 2+6) = (7,8)
 *
 * ex2) n = 15, cnt = 3 (1, 2, 3)
 * 15 - (1 + 2 + 3) = 9
 * 9 / 3 = 3
 * (1+3, 2+3, 3+3) = (4,5,6)
 *
 * ex3) n = 15, cnt = 4 (1,2,3,4) => 안 되는 경우
 * 15 - (1 + 2 + 3 + 4) = 5
 * 5 / 4 = 나머지가 존재 => 해당하지 않음
 */