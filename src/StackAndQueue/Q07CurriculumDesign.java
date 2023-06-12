package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정 설계
 * 05-06
 */
public class Q07CurriculumDesign {
    public static String solution(String required, String str) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char x : required.toCharArray()) {
            queue.offer(x);
        }

        for (char y : str.toCharArray()) {
            if (queue.contains(y)) {
                if (queue.poll() != y) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String required = kb.next();
        String str = kb.next();
        System.out.println(solution(required, str));
    }
}
