package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Greedy 09-01
 * 씨름 선수
 */
public class Q01Wrestler {
    public static class Player implements Comparable<Player> {
        public int height;
        public int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {

            return o.height - this.height;
        }
    }
    public static int solution(ArrayList<Player> list) {
        int answer = 0;

        Collections.sort(list);

        int weight = Integer.MIN_VALUE;
        for (Player p : list) {
            if (p.weight > weight) {
                weight = p.weight;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Player> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = kb.nextInt();
            int weight = kb.nextInt();
            list.add(new Player(height, weight));
        }

        System.out.println(solution(list));
    }
}
