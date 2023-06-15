package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 마구간 정하기 (결정 알고리즘)
 * 06-10
 */
public class Q10SetupStable {
    public static int count(int[] arr, int dist) {
        int cnt = 1; // 말의 수
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1; // 거리니까 최소 1로 놓기
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2; // 가장 가까운 두 말의 최대 거리가 5로 일단 답으로 선정하고

            // 위에서 정한 값이 유효한지 검증
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, c, arr));
    }
}
/**
 * 검증하는 count 메서드 만들어서 사용하기
 */