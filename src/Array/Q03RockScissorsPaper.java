package Array;

import java.util.Scanner;

/**
 * 가위 바위 보
 * 02-03
 */
public class Q03RockScissorsPaper {
    /**
     *  A가 이길 경우 A 출력
     *  B가 이길 경우 B 출력
     *  비길 경우 D 출력
     *
     *  1: 가위
     *  2: 바위
     *  3: 보
     *
     *  이기는 경우
     *  1. 바위 - 가위 : 2 - 1  = 1
     *  2. 보 - 바위 : 3 - 2 = 1
     *  3. 가위 - 보 : 1 - 3 = -2
     *
     *  지는 경우
     *  1. 가위 - 바위 : 1 - 2 = -1
     *  2. 바위 - 보 : 2 - 3 = -1
     *  3. 보 - 가위 : 3 - 1 = 2
     *
     *  비기는 경우
     *  1. 가위 - 가위 : 1 - 1 = 0
     *
     *  가위 - 보 예외 처리만 필요
     */
    public static String[] solution(int[] a, int[] b) {
        String[] answer = new String[a.length];

        // O(n)
        for (int i = 0; i < a.length; i++) {
            if (a[i] - b[i] == 1 || a[i] - b[i] == -2) {
                answer[i] = "A";
            } else if (a[i] - b[i] == 0) {
                answer[i] = "D";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        // O(n)
        for (int i = 0; i < n; i++) {
            A[i] = kb.nextInt();
        }

        // O(n)
        for (int i = 0; i < n; i++) {
            B[i] = kb.nextInt();
        }

        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(solution(A, B)[i]);
        }
    }
}
