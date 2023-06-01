package Array;

import java.util.Scanner;

/**
 * 멘토링
 * 02-12
 */
public class Q12Mentoring {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        // 모든 경우의 수 고려
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;

                for (int k = 0; k < m; k++) { // 테스트 수 만큼
                    int ranki = 0;
                    int rankj = 0;

                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) {
                            ranki = l;
                        }

                        if (arr[k][l] == j) {
                            rankj = l;
                        }
                    }

                    if (ranki < rankj) {
                        cnt++;
                    }

                }

                if (cnt == m) { // 모든 케이스가 높은 경우
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

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();;
            }
        }

        System.out.println(solution(n, m, arr));
    }
}
