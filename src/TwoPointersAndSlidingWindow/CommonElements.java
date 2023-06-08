package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 구하기
 * 03-02
 */
public class CommonElements {
    public static ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0; // 포인터 1
        int p2 = 0; // 포인터 2

        // 배열을 정렬을 해놓고
        Arrays.sort(a);
        Arrays.sort(b);

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else if (a[p1] > b[p2]) {
                p2++;
            }
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
