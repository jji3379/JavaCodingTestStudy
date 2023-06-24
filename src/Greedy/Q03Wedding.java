package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Greedy 09-03
 * 결혼식
 */
public class Q03Wedding {
    public static class Time implements Comparable<Time> {
        public int time;
        public char type;

        public Time(int time, char type) {
            this.time = time;
            this.type = type;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.type - o.type;
            } else {
                return this.time - o.time;
            }
        }
    }
    public static int solution(ArrayList<Time> list) {
        int answer = 0;

        Collections.sort(list);

        int cnt = 0;
        for (Time t : list) {
            if (t.type == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            list.add(new Time(start, 's'));
            list.add(new Time(end, 'e'));
        }

        System.out.println(solution(list));
    }
}
