package String;

import java.util.Scanner;

/**
 * 01-03
 * 문장속 가장 긴 단어 찾기
 */
public class LongWord03 {
    public static String solution(String str) {
        String answer = "";
        int m = 0;

        String[] test = str.split(" ");
        for (String x : test) {
            int length = x.length();
            if (length > m) {
                m = length;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 한줄 받기

        System.out.println(solution(str));
    }
}
