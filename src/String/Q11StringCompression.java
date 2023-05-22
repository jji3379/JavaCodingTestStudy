package String;

import java.util.Scanner;

/**
 * 문자열 압축
 * 01-11
 */
public class Q11StringCompression {
    public static String solution(String str) {
        String answer = "";

        str = str + " ";

        int cnt = 1;
        // 빈 문자를 하나 넣었기 때문에 str.length()-1 까지
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1) {
                    answer += cnt;
                    cnt = 1;
                }
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
 * i 와 i+1 비교
 * 맨 뒤에 빈 문자열 하나를 추가해준다.
 * => 이 때 for 문은 str.length()-1 까지 돌아야 한다. (빈 문자열을 추가해줬으니까)
 */