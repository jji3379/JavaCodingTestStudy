package String;

import java.util.Scanner;

/**
 * 암호
 * 01-12
 */
public class Q12Password {
    public static String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            // index 7 뒤에 있는 문자열
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n, str));
    }
}
/**
 * String -> 2진수 : Integer.parseInt(tmp, 2)
 * substring(0, 7) : 0 ~ 6 까지
 * substring(7) : 7 ~ 끝까지
 * int -> char : (char) num
 */