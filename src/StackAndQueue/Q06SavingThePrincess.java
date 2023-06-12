package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주 구하기
 * 05-06
 */
public class Q06SavingThePrincess {
    public static int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(solution(n, k));
    }
}
/**
 * Queue 메서드
 * 값 추가 : Q.offer(x)
 *
 * 값 꺼내고 return : Q.poll() (stack 의 pop)
 *
 * 값 확인 : Q.peek()
 *
 * 존재 여부 확인 : Q.contains(x)
 */