package String;

import java.util.Scanner;

/**
 * 중복문자제거
 * 01-06
 */
public class Distinct06 {
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
/**
 * indexOf() : 해당 문자가 처음 나온 인덱스 반환
 */

