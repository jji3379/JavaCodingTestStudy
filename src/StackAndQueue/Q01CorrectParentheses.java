package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 * 05-01
 */
public class Q01CorrectParentheses {
    public static String solution(String str) {
        String answer = "YES";

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push("(");
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
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
 * 괄호 문제
 * '(' 가 들어오면 push
 * ')' 가 들어오면 pop 으로 짝을 맞춘다.
 */