package String;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * 01-10
 */
public class Q10ShortestTextDistance {
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        // 값 비교를 위한 초기 무한대 수 설정 (왼쪽 -> 오른쪽 1차 비교)
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽 -> 왼쪽 2차 비교
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t= kb.next().charAt(0);
        for (int answer : solution(s, t)) {
            System.out.print(answer + " ");
        }

    }
}
/**
 *  왼쪽 -> 오른쪽
 *  오른쪽 -> 왼쪽
 *  양쪽 비교
 *
 *  Math.min(answer[i], p) : 둘 중 작은 값 사용
 */
