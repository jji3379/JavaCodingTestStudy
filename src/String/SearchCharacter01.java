package String;

import java.util.Scanner;

/**
 * String 01-01
 * 문자 찾기
 */
public class SearchCharacter01 {

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase(); // String 대문자 화
        t = Character.toUpperCase(t); // char 대문자 화

        /**
         * forEach 방식
         */
        for (char x : str.toCharArray()) { // char[] 만들기
            if (x == t) {
                answer++;
            }
        }

        /** for 문 방식
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }
         */

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열 하나 읽어오기

        char c = kb.next().charAt(0); // 문자 하나 읽어오기

        System.out.println(solution(str, c));
    }
}
/**
 * 문자(char) 하나 읽기 => str.charAt(i);
 * 문자열(String) 대문자화 => str.toUpperCase();
 * 문자(char) 대문자화 => Character.toUpperCase(char);
 * String => char[] 만들기 => str.toCharArray();
 */
