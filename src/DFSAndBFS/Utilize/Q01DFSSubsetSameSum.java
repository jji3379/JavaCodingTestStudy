package DFSAndBFS.Utilize;

import java.util.Scanner;

/**
 * DFS & BFS 08-01
 * 합이 같은 부분집합 (DFS)
 */
public class Q01DFSSubsetSameSum {

    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public static void DFS(int L, int sum, int[] arr) {
        if (flag == true || sum > total / 2) {
            return;
        }

        if (L == n) { // 끝까지 다 돈 경우
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }

        DFS(0, 0, arr);

        System.out.println(answer);
    }
}
