package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Greedy 09-04
 * 최대 수입 스케쥴
 */
public class Q04MaximumIncomeSchedule {
    public static class Lecture implements Comparable<Lecture> {
        public int money;
        public int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;
        }
    }

    public static int solution(ArrayList<Lecture> list, int max, int n) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (list.get(j).time < i) { // 해당 날짜가 없는 경우 넘어간다.
                    break;
                }
                pq.offer(list.get(j).money); // pq 에 값 넣기
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Lecture> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int money = kb.nextInt();
            int time = kb.nextInt();

            list.add(new Lecture(money, time));
            if (time > max) {
                max = time;
            }
        }

        System.out.println(solution(list, max, n));
    }
}
