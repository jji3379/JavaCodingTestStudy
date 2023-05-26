package Array;

import java.util.Scanner;

/**
 * 보이는 학생
 * 02-02
 */
public class Q02VisibleStudent {
    /**
     *  앞 사람보다 크면 보이고, 작거나 같으면 보이지 않는다.
     */
    public static int solution(int[] arr) {
        int answer = 0;
        int max = 0;
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
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

        System.out.println(solution(arr));
    }
}
