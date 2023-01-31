package String;

import java.util.Scanner;

/**
 * 대소문자 변환
 */
public class Q02UpperLower {
    public static String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

//        for (char x : str.toCharArray()) {
//            if (x >= 97 && x <= 122) { // 대문자로 변경
//                answer += (char)(x - 32); // 문자에 연산자를 넣으면 숫자로 인식
//            } else { // 소문자로 변경
//                answer += (char)(x + 32);
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution(str));
    }
}
/**
 * 문자(char) 대소문자 확인 => Character.isLowerCase(x);
 * 문자(char) 대문자화 => Character.toUpperCase(x);
 */

/**
 * 아스키 코드 대소문자
 * 대문자 : 65(A) ~ 90
 * 소문자 : 97(a) ~ 122
 * 둘의 차이 32 (소문자 - 대문자 = 32)
 */