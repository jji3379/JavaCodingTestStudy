package StackAndQueue;

import java.nio.file.StandardWatchEventKinds;
import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 * 05-02
 */
public class Q02RemoveParentheses {
    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(str.charAt(i));
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
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
 * 문제에 괄호 나오면 십중팔구 Stack 문제!
 */
