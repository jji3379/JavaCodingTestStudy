package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Greedy 09-02
 * 회의실 배정
 */
public class Q02MeetingRoomAssignment {
    public static class Meeting implements Comparable<Meeting> {
        public int start;
        public int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) { // 끝나는 시간으로 오름차순 정렬
            if (o.end == this.end) {
                return this.start - o.start;
            }

            return this.end - o.end;
        }
    }
    public static int solution(ArrayList<Meeting> list) {
        int answer = 0;

        Collections.sort(list);

        int end = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).start >= end) {
                answer++;
                end = list.get(i).end;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            list.add(new Meeting(start, end));
        }

        System.out.println(solution(list));
    }
}
