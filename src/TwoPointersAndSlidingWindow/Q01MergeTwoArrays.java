package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 * 03-01
 */
public class Q01MergeTwoArrays {

    public static ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0; // 포인터 1
        int p2 = 0; // 포인터 2

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1]);
                p1++;
            } else {
                answer.add(b[p2]);
                p2++;
            }
        }

        while (p1 < n) {
            answer.add(a[p1]);
            p1++;
        }

        while (p2 < m) {
            answer.add(b[p2]);
            p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int value : solution(n, a, m, b)) {
            System.out.print(value + " ");
        }
    }
}
/**
 * 이런 문제는 간단하지만 투 포인터를 아는지 물어보는 문제이므로,
 * 투 포인터로 풀어야 한다.
 */