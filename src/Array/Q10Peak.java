package Array;


import java.util.Scanner;

/**
 * 봉우리
 * 02-10
 */
public class Q10Peak {
    public static int solution(int[][] arr) {
        int cnt = 0;
        int length = arr.length;

        for (int i = 1; i < length - 1; i++) {
            for (int j = 1; j < length - 1; j++) {
                int value = arr[i][j];
                int leftValue = arr[i-1][j];
                int rightValue = arr[i+1][j];
                int topValue = arr[i][j-1];
                int downValue = arr[i][j+1];

                if (value > leftValue && value > rightValue && value > topValue && value > downValue) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || i == arr.length-1 || j == 0 || j == arr.length-1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = kb.nextInt();
                }
            }
        }

        System.out.println(solution(arr));
    }
}
