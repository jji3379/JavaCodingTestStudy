package String;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 01-05
 */
public class Q05SpecConvert {
    public static String solution1(String str) {
        String answer = "";
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        /**
         * 왼쪽은 하나씩 증가, 오른쪽은 하나씩 감소하기 때문에
         * 오른쪽이 왼쪽 보다 작아지는 경우에는 중간까지 끝난 것
         */
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else { // 둘 다 알파벳일 경우 swap
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        // char[] -> String
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution1(str));
    }
}
/**
 * String -> char[] : str.toCharArray()
 * char 알파벳인지 확인 : Character.isAlphabetic(s[lt])
 * char[] -> String : String.valueOf(char[])
 */
