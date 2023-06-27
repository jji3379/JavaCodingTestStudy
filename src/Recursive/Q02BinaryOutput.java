package Recursive;

/**
 * Recursive 07-02
 * 이진수 출력 (재귀함수)
 */
public class Q02BinaryOutput {
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        DFS(11);
    }
}
/**
 * 10진수 -> 2진수로 출력
 * 2진수를 밑에서부터 출력해야 한다.
 */
