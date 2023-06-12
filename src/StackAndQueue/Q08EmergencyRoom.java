package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 * 05-08
 */
public class Q08EmergencyRoom {

    static class Person {
        private int id;
        private int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }


    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if (x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
/**
 * 값의 순서와 우선순위를 동시에 다뤄야할 경우
 * 새로운 이너 클래스를 정의해서 푼다.
 */