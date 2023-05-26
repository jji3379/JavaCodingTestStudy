package Array;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 * 02-05
 */
public class Q05PrimaryNumber {
    /**
     * 기본 0으로 세팅 후
     * 0이면 answer++, 후 배수들 다 1로 변경
     * 위와 같은 방법을 반복
     */
    public static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1]; // 인덱스 번호가 n 번까지 생겨야 하므로 n+1 까지

        // O(n)
        for (int i = 2; i < n; i++) {
            if(ch[i] == 0 ) {
                answer++;
                ch[i] = 1;
                for (int j = i; j <= n; j = j + i) { // i의 배수들을 1로 변경
                    ch[j] = 1;
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
