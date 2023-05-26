package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 * 02-06
 */
public class Q06ReversePrimaryNumber {
    // 소수 판별법
    public static boolean isPrime(int num) {
        if (num == 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // 소수가 아님
            }
        }

        return true;
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String reverseValue = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            int reverseInt = Integer.parseInt(reverseValue);
            if (isPrime(reverseInt)) {
                answer.add(reverseInt);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
/**
 * -- 소수 판별법 --
 * 1. 1 제외 (1은 소수가 아니다.)
 * 2. 2부터 num까지 나누어 떨어지는 수가 없으면 소수이다.
 *
 * -- 숫자 뒤집기 --
 * 1. String reverseValue = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
 * 2. int reverseInt = Integer.parseInt(reverseValue);
 *
 */