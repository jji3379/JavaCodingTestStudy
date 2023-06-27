package Recursive;

import java.util.Scanner;

/**
 * Recursive 07-01
 * 재귀함수 (스택프레임)
 */
public class Q01Recursive {
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DFS(3);
    }
}
/**
 * 재귀함수는 스택프레임에 기반하여 동작한다.
 * 재귀함수가 DFS(3) - DFS(2) - DFS(1) - DFS(0) 순서로 실행되었다고 하면,
 * 스택 프레임에 해당 순서로 넣어지기 때문에
 * 나오는 순서는 그 반대로 출력되게 된다.
 *
 * 재귀의 스택 프레임에는 해당 값과 어느 라인까지 진행되었는지가 저장되어 있고,
 * 출력될 때 그 다음 라인으로 가게 된다.
 * ex)
 *
 * 스택 프레임
 * DFS(0) - 14 ==> 1번 (return)
 * DFS(1) - 14 ==> 2번 (1)
 * DFS(2) - 14 ==> 3번 (2)
 * DFS(3) - 14 ==> 4번 (3)
 *
 * 출력 : 1 2 3
 *
 *
 * 재귀함수를 사용할 때는 무한루프를 방지하기 위해 종료 시점이 필요하다.
 * 그러므로, if-else 를 사용하여 종료문을 만들어 준다.
 */