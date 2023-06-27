package Recursive;

/**
 * Recursive 07-04
 * 피보나치 수열 (메모이제이션)
 */
public class Q04Fibonacci {
    static int[] fibo; // 성능을 위해 1번 계산한 것들은 저장한다.
    public static int DFS(int n) {
        if (fibo[n] > 0) { // 이미 구한 값이 있으면 저장한 곳에서 값을 사용
            return fibo[n];
        }

        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1); // 해당 값을 넣고 리턴
        }
    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
/**
 * 스택 프레임 때문에 성능은 for 문으로 구현하는게 더 좋다.
 * 메모리에 정보가 생기기 때문
 */