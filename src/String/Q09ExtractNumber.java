package String;

import java.util.Scanner;

/**
 * 숫자만 추출
 * 01-09
 */
public class Q09ExtractNumber {
    /**
     *  문자열에서 숫자만 추출하여 순서대로 자연수 만들기
     *  맨 앞이 0 이면 제거
     */
    public static int solution(String str) {
        String answer = "";

        str = str.replaceAll("[^0-9]", "");

        answer = str;

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
/**
 * 숫자만 사용 : [^0-9]
 * Integer.parseInt() : 문자열을 정수로 변환 (0208 -> 208)
 */