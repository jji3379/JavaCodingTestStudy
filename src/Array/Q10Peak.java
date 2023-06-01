package Array;


import java.util.Scanner;

/**
 * 봉우리
 * 02-10
 */
public class Q10Peak {
    // 내가 푼 버전
    public static int solution1(int[][] arr) {
        int cnt = 0;
        int length = arr.length;

        for (int i = 1; i < length - 1; i++) {
            for (int j = 1; j < length - 1; j++) {
                int value = arr[i][j];
                int topValue = arr[i-1][j];
                int rightValue = arr[i][j+1];
                int downValue = arr[i+1][j];
                int leftValue = arr[i][j-1];

                if (value > leftValue && value > rightValue && value > topValue && value > downValue) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static int solution2(int n, int[][] arr) {
        int cnt = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag == true) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        /**
         * 내가 푼 방법
         */
//        int[][] arr = new int[n+2][n+2];
//
//        for(int i=0; i<arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i == 0 || i == arr.length-1 || j == 0 || j == arr.length-1) {
//                    arr[i][j] = 0;
//                } else {
//                    arr[i][j] = kb.nextInt();
//                }
//            }
//        }
//
//        System.out.println(solution1(arr));

        /**
         * 풀이 방법
         */
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution2(n, arr2));
    }
}
/**
 * 4방향 검사 (시계방향)
 *
 * int[] dx = {-1, 0, 1, 0};
 * int[] dy = {0, 1, 0, -1};
 *
 *   경계 조건 및 값 비교 조건
 *   if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
 *     flag = false;
 *     break;
 *   }
 *
 *   // 개수 확인
 *   if (flag == true) {
 *     cnt++;
 *   }
 */
