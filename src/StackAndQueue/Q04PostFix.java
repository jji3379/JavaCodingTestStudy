package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postifx)
 * 05-04
 */
public class Q04PostFix {
    public static int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                int cal = 0;

                switch (x) {
                    case '+'
                        : cal = lt + rt;
                        break;
                    case '-'
                        : cal = lt - rt;
                        break;
                    case '*'
                        : cal = lt * rt;
                        break;
                    case '/'
                        : cal = lt / rt;
                        break;
                    default:
                        break;
                }
                stack.push(cal);
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
/**
 * 문자값이 숫자인지 판단
 * Character.isDigit(x)
 *
 * char -> int
 * x - 48
 */