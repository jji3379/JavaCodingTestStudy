package Recursive;

/**
 * Recursive 07-03
 * 팩토리얼 (재귀함수)
 */
public class Q03Factorial {
    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        DFS(5);
    }
}
