package TwoPointersAndSlidingWindow;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * 03-06
 */
public class Q06MaxLengthContuinuosSubsequence {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }

            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt --;
                }
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
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

        System.out.println(solution(n, k, arr));
    }
}
/**
 * rt 는 계속 0이 보이면 1로 바꾸고,
 * -> 그 가운데 cnt 체크를 해서 넘어가지 않도록 조정
 * -> lt 움직여서 rt 가 1로 바꾼걸 0 으로 바꾸기
 */