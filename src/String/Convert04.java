package String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 * 01-04
 */
public class Convert04 {
    public static ArrayList<String> solution1(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : solution2(n, str)) {
            System.out.println(x);
        }
    }
}

/**
 * 문자 뒤집기 : StringBuilder.reverse()
 */