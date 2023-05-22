package String;

import java.util.Scanner;

/**
 * 팰린드롬(replaceAll 정규식 이용)
 * 01-08
 */
public class Q08Palindrome {
    /**
     *  앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
     *  팰린드롬이면 YES, 아니면 NO를 출력
     *  단, 알파벳 이외의 문자는 무시
     */

    // 내가 푼 방법
    public static String solution(String str) {
        String answer = "NO";

        // 특수문자 제외 정규식 ([^a-z] : a부터 z까지가 아닌 것들을 ""로 바꿔라)
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            return "YES";
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
/**
 * replaceAll 정규식
 * - [^a-z] : a부터 z까지가 아닌 것들을 ""로 바꿔라
 * -> 특수문자 제외
 * -> 문자만 다루겠다.
 */
