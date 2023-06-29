package DFSAndBFS.Utilize;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * DFS & BFS 08-03
 * 최대점수 구하기 (DFS)
 */
public class Q03MaxScore {
    static int n, m;
    static int answer = 0;

    public static class Problem {
        public int score;
        public int time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    public static void DFS(int L, int sumScore, int sumTime, ArrayList<Problem> list) {
        if (sumTime > m) {
            return;
        }

        if (L == n) {
            answer = Math.max(answer, sumScore);
        } else {
            DFS(L+1, sumScore + list.get(L).score, sumTime + list.get(L).time, list);
            DFS(L+1, sumScore, sumTime, list);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        ArrayList<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = kb.nextInt();
            int time = kb.nextInt();

            list.add(new Problem(score, time));
        }

        DFS(0, 0, 0, list);

        System.out.println(answer);
    }
}
