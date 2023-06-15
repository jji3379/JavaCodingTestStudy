package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직 비디오(결정알고리즘)
 * 06-09
 */
public class Q09MusicVideo {
    public static int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
/**
 * 이분 탐색
 * 배열 최대값 찾기 : Arrays.stream(arr).max().getAsInt();
 */