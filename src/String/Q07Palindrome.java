package String;

import java.util.Scanner;

/**
 * 회문 문자열 (앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열)
 * 01-07
 */
public class Q07Palindrome {
    // 내가 푼 방법
    public static String solution(String str) {
        String answer = "YES";

        // 대소문자 구분 X
        str = str.toLowerCase();
        int len = str.length();
        // 동시에 앞 뒤에서 하나씩 땡겨가면서 읽으면서 비교하기
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return "NO";
            }
        }

        return answer;
    }

    // 강의 방법
    public static String solution2(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution2(str));
    }
}
/**
 * new StringBuilder(str).reverse() : 문자열을 뒤집기
 * equalsIgnoreCase() : 대소문자 구분 X
 */